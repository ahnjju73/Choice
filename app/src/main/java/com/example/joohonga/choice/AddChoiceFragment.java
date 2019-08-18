package com.example.joohonga.choice;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link AddChoiceFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AddChoiceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddChoiceFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String questionTitle;
    private String choiceName;

    private View view;

    private EditText qTitle, choices;
    private Spinner timeSp, categorySp;

    private final String[] timeArray = getResources().getStringArray(R.array.timeArray);
    private final String[] categoryArray = getResources().getStringArray(R.array.categoryArray);



    private OnFragmentInteractionListener mListener;

    public AddChoiceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddChoiceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AddChoiceFragment newInstance(String param1, String param2) {
        AddChoiceFragment fragment = new AddChoiceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {





        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_add_choice, container, false);
        qTitle = view.findViewById(R.id.question_edit_text);
        choices = view.findViewById(R.id.choice_edit_text);

        timeSp = view.findViewById(R.id.time_spinner);
        categorySp = view.findViewById(R.id.category_spinner);

        CustomSpinnerAdapter timeSpinnerAdapter = new CustomSpinnerAdapter(getContext(), R.layout.spinner_item, Arrays.asList(timeArray));
        CustomSpinnerAdapter categorySpinnerAdapter = new CustomSpinnerAdapter(getContext(), R.layout.spinner_item, Arrays.asList(categoryArray));

        timeSp.setAdapter(timeSpinnerAdapter);
        categorySp.setAdapter(categorySpinnerAdapter);






        questionTitle = qTitle.getText().toString();
        choiceName = choices.getText().toString();




        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_choice, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }


/*    public class CustomSpinnerAdapterh extends BaseAdapter{

        Context context;
        List<String> data;
        LayoutInflater layoutInflater;

        public CustomSpinnerAdapterh(Context context, List<String> data){
            this.context = context;
            this.data = data;
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }


        @Override
        public int getCount() {
            if(data==null)
                return 0;
            else
                return data.size();
        }

        @Override
        public Object getItem(int i) {
            return data.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            if(view==null){
                view = layoutInflater.inflate(R.layout.fragment_add_choice, viewGroup, false);
            }
            if(data!= null){
                String text = data.get(i);
                ((TextView)view.findViewById(R.id.spinner_item)).setText(text);
            }
            return view;
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            if(convertView==null){
                convertView = layoutInflater.inflate(R.layout.spinner_item, parent, false);
            }

            //데이터세팅
            String text = data.get(position);
            ((TextView)convertView.findViewById(R.id.spinner_item)).setText(text);

            return convertView;
        }
    }
*/

}
