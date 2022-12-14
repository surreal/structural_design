package com.itcm.structural_design.modules.concrete.penetration;

import android.util.ArrayMap;
import android.util.Log;
import android.view.View;

import com.itcm.structural_design.R;
import com.itcm.structural_design.database.DBModel;
import com.itcm.structural_design.database.SQLRemote;
import com.itcm.structural_design.helpers.DialogHelper;
import com.itcm.structural_design.models.StructuralDesignModel;

import java.util.ArrayList;

public class PenetrationCategory_SubCategoryFive extends PenetrationCategory {


    public PenetrationCategory_SubCategoryFive(){
        resetValues();
        setValues();
        setAllAdapters();
        resetValuesLocal();
    }

    private void resetValuesLocal() {
        id_25_value = 1.4;
    }

    private void setAllAdapters() {
        setAdapter(true, initModels(true));
        setAdapter(false, initModels(false));
    }

    private void setValues() {
        if (savedVersionTitle != null) {
            cursor = sqlLocal.selectFiveComparesCursor("*", savedVersionTitle);
            cursor.moveToFirst();
            id_1_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_1);
            id_2_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_2);
            id_3_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_3);
            id_9_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_9);
            id_10_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_10);
            id_15_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_15);
            id_16_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_16);
            id_103_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_103);
            id_106_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_106);
            id_22_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_22);
            id_23_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_23);
            id_24_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_24);
            id_25_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_25);
            id_36_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_36);
            id_38_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_38);
            id_41_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_41);
            id_43_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_43);
            id_45_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_45);
            id_62_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_62);
            id_63_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_63);
            id_66_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_66);
            id_69_position = sqlLocal.getRelevantIntValue(cursor, null, DBModel.COLUMN_ID_69_POSITION);
            id_4001_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4001);
            id_4002_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4002);
            id_4003_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4003);
            id_4004_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4004);
            id_4005_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4005);
            id_4006_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4006);
            id_4007_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4007);
            id_4008_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4008);
            id_4009_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4009);
            id_4010_value = sqlLocal.getRelevantDoubleValue(cursor, null, DBModel.COLUMN_VAL_ID_4010);
        }
        spinnerPositionsArray = new ArrayMap<>();
        spinnerPositionsArray.put(9, getPositionByValue(getFrom_7_5_to_20_stringValues(), id_9_value));
        spinnerPositionsArray.put(10, getPositionByValue(getFrom_8_to_25_stringValues(), id_10_value));
        spinnerPositionsArray.put(15, getPositionByValue(getFrom_7_5_to_20_stringValues(), id_15_value));
        spinnerPositionsArray.put(16, getPositionByValue(getFrom_8_to_25_stringValues(), id_16_value));
        spinnerPositionsArray.put(22, getPositionByValue(getConcreteTypeDoubleValues(), id_22_value));
        spinnerPositionsArray.put(23, getPositionByValue(getFrom_400_to_500_stringValues(), id_23_value));
        spinnerPositionsArray.put(25, getPositionByValue(getFrom_1_4_to_1_5_doubleValues(), id_25_value));
        spinnerPositionsArray.put(36, getPositionByValue(getFrom_8_to_25_stringValues(), id_36_value));
        spinnerPositionsArray.put(43, getPositionByValue(getFrom_45_to_90_stringValues(), id_43_value));
        spinnerPositionsArray.put(62, getPositionByValue(getFrom_8_to_25_stringValues(), id_62_value));
        spinnerPositionsArray.put(4001, getPositionByValue(getFrom_2_to_24_stringValues(), id_4001_value));
        spinnerPositionsArray.put(4002, getPositionByValue(getFrom_2_to_24_stringValues(), id_4002_value));
        spinnerPositionsArray.put(4003, getPositionByValue(getFrom_2_to_24_stringValues(), id_4003_value));
        spinnerPositionsArray.put(4004, getPositionByValue(getFrom_2_to_24_stringValues(), id_4004_value));
        spinnerPositionsArray.put(4005, getPositionByValue(getFrom_2_to_24_stringValues(), id_4005_value));
        spinnerPositionsArray.put(4006, getPositionByValue(getFrom_2_to_24_stringValues(), id_4006_value));
        spinnerPositionsArray.put(4007, getPositionByValue(getFrom_2_to_24_stringValues(), id_4007_value));
        spinnerPositionsArray.put(4008, getPositionByValue(getFrom_2_to_24_stringValues(), id_4008_value));
        spinnerPositionsArray.put(4009, getPositionByValue(getFrom_2_to_24_stringValues(), id_4009_value));
        spinnerPositionsArray.put(4010, getPositionByValue(getFrom_2_to_24_stringValues(), id_4010_value));
        Log.d("checkSetValues", "id_4001_value == " + id_4001_value + "; id_4002_value == " + id_4002_value);
        id_9_position = spinnerPositionsArray.get(9);
        id_10_position = spinnerPositionsArray.get(10);
        id_15_position = spinnerPositionsArray.get(15);
        id_16_position = spinnerPositionsArray.get(16);
        id_22_position = spinnerPositionsArray.get(22);
        id_23_position = spinnerPositionsArray.get(23);
        id_25_position = spinnerPositionsArray.get(25);
        id_36_position = spinnerPositionsArray.get(36);
        id_43_position = spinnerPositionsArray.get(43);
        id_62_position = spinnerPositionsArray.get(62);
        id_4001_position = spinnerPositionsArray.get(4001);
        id_4002_position = spinnerPositionsArray.get(4002);
        id_4003_position = spinnerPositionsArray.get(4003);
        id_4004_position = spinnerPositionsArray.get(4004);
        id_4005_position = spinnerPositionsArray.get(4005);
        id_4006_position = spinnerPositionsArray.get(4006);
        id_4007_position = spinnerPositionsArray.get(4007);
        id_4008_position = spinnerPositionsArray.get(4008);
        id_4009_position = spinnerPositionsArray.get(4009);
        id_4010_position = spinnerPositionsArray.get(4010);
    }

    public void tonOrKnBtnClicked() {
        setRelevantResultItem_value(29, mathId_29(), getRelevantSecondMeasuringUnit(0));
        setRelevantResultItem_value(32, mathId_32(), getRelevantSecondMeasuringUnit(0));
        setRelevantResultItem_value(34, mathId_34(), getRelevantSecondMeasuringUnit(0));
        setRelevantResultItem_value(52, mathId_52(), getRelevantSecondMeasuringUnit(0));
        setRelevantValueItemMeasuringUnit(24, getRelevantSecondMeasuringUnit(0));
    }

    private ArrayList<StructuralDesignModel> initModels(boolean isForSetValuesModels) {
        if (isForSetValuesModels){
            valuesPositionsByIds = new ArrayMap<>();
            valuesModels = new ArrayList<>();
            valuesModels.add(new StructuralDesignModel(1, "???????? ??????", "h", "[cm]", id_1_value+"", 0));
            valuesModels.add(new StructuralDesignModel(2, "???????? ?????????? ?????? ???????? ?????????? X", "ds,x", "[cm]", id_2_value+"", 0));
            valuesModels.add(new StructuralDesignModel(3, "???????? ?????????? ?????? ???????? ?????????? Y", "ds,y", "[cm]", id_3_value+"", 0));
            valuesModels.add(new StructuralDesignModel(9, "?????????? ???????? ????????, ???????????? X", "@", "[cm]", "", id_9_position));
            valuesModels.add(new StructuralDesignModel(10, "???????? ???????? ????????, ???????????? X", "??", "[mm]", "", id_10_position));
            valuesModels.add(new StructuralDesignModel(15, "??????????  ???????? ????????, ???????????? Y", "@", "[cm]", "", id_15_position));
            valuesModels.add(new StructuralDesignModel(16, "???????? ???????? ???????? , ???????????? Y", "??", "[mm]", "", id_16_position));
            valuesModels.add(new StructuralDesignModel(103, "?????????? ????????", "???????? ????????", "[cm]", id_103_value+"", 0));
            valuesModels.add(new StructuralDesignModel(106, "???????? ???????? ?????????? ???????? ???????? ???????? ????????", "", "[cm]", id_106_value+"", 0));
            valuesModels.add(new StructuralDesignModel(22, "?????? ????????", "", "", "", id_22_position));
            valuesModels.add(new StructuralDesignModel(23, "???????? ?????????????? ???? ?????????? ????????????", "fsk", "[Mpa]", "", id_23_position));
            valuesModels.add(new StructuralDesignModel(24, "?????? ???????? ????????????", "Vd", "[KN]", id_24_value+"", 0));
            valuesModels.add(new StructuralDesignModel(25, "?????????? ??????????", "??", "", "", id_25_position));
            valuesModels.add(new StructuralDesignModel(36, "???????? ???????? ?????????? ????????????", "??", "[mm]", "", id_36_position));
            valuesModels.add(new StructuralDesignModel(38, "???????? ?????????????? ?????? ???????? ????????????????", "Sr", "cm", id_38_value+"", 0));
            valuesModels.add(new StructuralDesignModel(41, "???????? ?????????? ?????? ???????? ???????????????? ?????????? ????????????", "St1", "cm", id_41_value+"", 0));
            valuesModels.add(new StructuralDesignModel(43, "???????? ?????????? ???? ????????????", "??", "[?? ]", "", id_43_position));
            valuesModels.add(new StructuralDesignModel(45, "???????? ?????????? ?????? ???????? ???????????????? ?????????? ????????", "St2", "cm", id_45_value+"", 0));
            valuesModels.add(new StructuralDesignModel(62, "???????? ?????? ??????????", "??", "mm", "", id_62_position));
            valuesModels.add(new StructuralDesignModel(63, "", "???? ?????????? ???????? ?????????? ?????????? ?????????? ?????????? X", "", id_63_value+"", 0));
            valuesModels.add(new StructuralDesignModel(66, "", "???? ?????????? ???????? ?????????? ?????????? ?????????? ?????????? Y", "", id_66_value+"", 0));
            valuesModels.add(new StructuralDesignModel(69, "???????? ????????", "", "", "", id_69_position));
            valuesModels.add(new StructuralDesignModel(4000, "???? ?????????? ???????? ?????????????? ????????", "", "", "", get_4000_relevantPosition()));
            setValuesModelsPositions();
            return valuesModels;
        } else {
            resultPositionsByIds = new ArrayMap<>();
            resultModels = new ArrayList<>();
            resultModels.add(new StructuralDesignModel(4, "??????????", "h>16cm", "", mathId_4()+"", 0));
            resultModels.add(new StructuralDesignModel(5, "dx", "???????? ????????  ???? ???????? ?????????? X", "[??m]", mathId_5(), 0));
            resultModels.add(new StructuralDesignModel(6, "dy", "???????? ????????  ???? ???????? ?????????? Y", "[??m]", mathId_6(), 0));
            resultModels.add(new StructuralDesignModel(7, "dm", "???????? ???????? ?????????? ???? ??????????", "[??m]", mathId_7(), 0));
            resultModels.add(new StructuralDesignModel(11, "???????? ???????? ??????????, ???????????? X", "", "", mathId_11(), 0));
            resultModels.add(new StructuralDesignModel(12, "?????? ???????? ????????, ???????????? X", "As,act", "[cm??]", mathId_12(), 0));
            resultModels.add(new StructuralDesignModel(13, "?????????? ?????? ???????? ???? ???????? ???????????? ???????????? X", "??,x", "", mathId_13(), 0));
            resultModels.add(new StructuralDesignModel(14, "(??_act)>??,min", "??,x,y>=0.005", "", mathId_14(), 0));
            resultModels.add(new StructuralDesignModel(17, "???????? ???????? ??????????, ???????????? Y", "", "", mathId_17(), 0));
            resultModels.add(new StructuralDesignModel(18, "?????? ???????? ???????? , ???????????? Y", "As,act", "[cm??]", mathId_18(), 0));
            resultModels.add(new StructuralDesignModel(19, "?????????? ?????? ???????? ???? ???????? ???????????? ???????????? Y", "??,y", "", mathId_19(), 0));
            resultModels.add(new StructuralDesignModel(20, "", "", "", mathId_20(), 0));
            resultModels.add(new StructuralDesignModel(21, "??????????  ??????????  ?????????????? ???? ???????? ????????????", "??", "", mathId_21(), 0));
            resultModels.add(new StructuralDesignModel(26, "???????? ?????????????? ???? ??????????", "fck", "[Mpa]", id_26_value+"", 0));
            resultModels.add(new StructuralDesignModel(27, "???????? ????????", "fcd", "[Mpa]", mathId_27(), 0));
            resultModels.add(new StructuralDesignModel(28, "???????? ????????", "fcd", "[Mpa]", mathId_28(), 0));
            resultModels.add(new StructuralDesignModel(108, "???????? ????????", "U,0", "[??m]", mathId_108(), 0));
            resultModels.add(new StructuralDesignModel(29, "?????? ?????????? ????????", "Vd,eq", "[KN]", mathId_29(), 0));
            resultModels.add(new StructuralDesignModel(30, "K", "", "", mathId_30(), 0));
            resultModels.add(new StructuralDesignModel(31, "???????? ?????????? ??????????", "U,1", "[??m]", mathId_31(1), 0));
            resultModels.add(new StructuralDesignModel(32, "???????????? ???????? ???????????? ?????????? 1", "VRdc,U1", "[KN]", mathId_32(), 0));
            resultModels.add(new StructuralDesignModel(33, "?????????? Vdeq ?????? Vrdmax", "", "", mathId_33(), 0));
            resultModels.add(new StructuralDesignModel(34, "???????????? ???????????????? ????????????", "VRd,max", "[KN]", mathId_34(), 0));
            resultModels.add(new StructuralDesignModel(35, "?????????? Vdeq ?????? Vrdmax", "", "", mathId_35(), 0));
            resultModels.add(new StructuralDesignModel(37, "???????? ?????????????? ?????????????? ?????? ??????????", "Sr", "cm", mathId_37(), 0));
            resultModels.add(new StructuralDesignModel(39, "?????????? ???????? ???????????? ???????? ?????????? ?????????? ??????", "Sr<0.75*dm", "-", mathId_39(), 0));
            resultModels.add(new StructuralDesignModel(40, "?????????? ???????????????? ?????? ?????????? ?????????? ??????????", "1.5dm", "[??m]", mathId_40(), 0));
            resultModels.add(new StructuralDesignModel(42, "?????????? ???????? ?????????? ???????? ?????????? ?????????? ??????????", "St1<1.5*dm", "-", mathId_42(), 0));
            resultModels.add(new StructuralDesignModel(44, "?????????? ???????????????? ?????? ?????????? ?????????? ????????", "2.0dm", "[??m]", mathId_44(), 0));
            resultModels.add(new StructuralDesignModel(46, "?????????? ???????? ?????????? ???????? ?????????? ?????????? ??????", "St1<2*dm", "-", mathId_46(), 0));
            resultModels.add(new StructuralDesignModel(47, "?????? ???????? ???????????????? ????????????", "??min", "", mathId_47(), 0));
            resultModels.add(new StructuralDesignModel(48, "?????? ?????????? ???????????? ?????????? ??????????????", "??sw", "-", mathId_48(), 0));
            resultModels.add(new StructuralDesignModel(49, "?????????? ?????? ???????? ???????????? ?????????? ?????? ???????? ????????????????", "??sw>??min", "", mathId_49(), 0));
            resultModels.add(new StructuralDesignModel(50, "?????????? ???????????????? ?????? ?????????? ?????????? ??????????", "Stmax", "[??m]", mathId_50(), 0));
            resultModels.add(new StructuralDesignModel(51, "?????????? ???????? ?????????? ???????? ?????????? ?????????? ??????????", "St<Stmax", "[??m]", mathId_51(), 0));
            resultModels.add(new StructuralDesignModel(52, "???????? ?????? ???????????? ???????? ????????????", "DVd", "[KN]", mathId_52(), 0));
            resultModels.add(new StructuralDesignModel(53, "???????? ?????? ???? ?????????? ????????????", "fsd,eff", "[Mpa]", mathId_53(), 0));
            resultModels.add(new StructuralDesignModel(54, "???? ???? ???????? ???????????? ???? ?????????? ???????????????? ?????????? ???? ?????????? ?????? ???????? ??????????", "(Asw_act)", "[cm]^2", mathId_54(), 0));
            resultModels.add(new StructuralDesignModel(55, "???????? ?????????? ??????", "U2", "[??m]", mathId_55(), 0));
            resultModels.add(new StructuralDesignModel(56, "???????? ???? ?????????? U ???????? ??????????", "R,U", "[??m]", mathId_56(), 0));
            resultModels.add(new StructuralDesignModel(57, "???????? ???? ?????????? ?????????? ???????? ??????????", "R,0", "[??m]", mathId_57(), 0));
            resultModels.add(new StructuralDesignModel(58, "???????? ???? ?????????? U1 ???????? ??????????", "R,U1", "[??m]", mathId_58(2), 0));
            resultModels.add(new StructuralDesignModel(59, "???????? ????????  ??????????  ??????  ???????? ??????????", "R,U2", "[??m]", mathId_59(2), 0));
            resultModels.add(new StructuralDesignModel(60, "????????  ???? ?????????? U ???????? ??????????", "R,U", "[??m]", mathId_60(), 0));
            resultModels.add(new StructuralDesignModel(61, "???? ???? ???????? ???????????? ?????????? ?????????? ???????? ???????????? ???????? ???????????????? ?????????? ?????????????? ??????????", "(Ash,d)", "[cm]^2", mathId_61(), 0));
            resultModels.add(new StructuralDesignModel(64, "", "???? ???? ???????? ???????????? ???? ?????????? ???????????????? ?????????? ???? ?????????? ?????? ???????? ??????????", "[cm]^2", mathId_64(), 0));
            resultModels.add(new StructuralDesignModel(65, "", "(Ash,x_act)>Ash,calc*0.5", "", mathId_65(), 0));
            resultModels.add(new StructuralDesignModel(67, "", "???? ???? ???????? ???????????? ???? ?????????? ???????????????? ?????????? ???? ?????????? ?????? ???????? ??????????", "[cm]^2", mathId_67(), 0));
            resultModels.add(new StructuralDesignModel(68, "", "(Ash,y_act)>Ash,calc*0.5", "", mathId_68(), 0));
            resultModels.add(new StructuralDesignModel(1000, "???????? ???? ??????????  ???????? ??????????", "??m", "", mathId_1000(), 0));
            resultModels.add(new StructuralDesignModel(2000, "???????? ???? ??????????", "??m", "", mathId_2000(id_25_value == 1.4 ? 0.75 : 0.5), 0));
            resultModels.add(new StructuralDesignModel(3000, "???????? ?????????????? ????????", "", "", mathId_3000(), 0));
            resultModels.add(new StructuralDesignModel(5000, "?????????? ???????? ?????????? ??????????", "", "", mathId_5000(), 0));
            resultModels.add(new StructuralDesignModel(6000, "???? ???? ???????? ???????????? ???? ?????????? ???????????????? ?????????? ???? ?????????? ?????? ???????? ??????????", "[cm]^2", "", mathId_6000(), 0));
            resultModels.add(new StructuralDesignModel(7000, "(Asw_act)>Asv,calc", "", "", mathId_7000(), 0));
            resultPositionsByIds.put(4000, valuesModels.size()-1);
            setResultModelsPositions();
            return resultModels;
        }
    }

    public View.OnClickListener onSaveClickListener = view -> insertOrUpdateVersion(savedVersionTitle == null);
    public void insertOrUpdateVersion(boolean isForInsert) {
        if (!isForInsert){
            updateDB();
            activity.finish();
            return;
        }
        dialogHelper.initInputDialog(view1 -> {
            Log.d("checkDialogBtnClicked", "categoryActiveId == " + categoryActiveId + "; subCategoryActiveId == " + subCategoryActiveId + "; DialogHelper.input == " + DialogHelper.input + "; cursor.getCount() == " + cursor.getCount() + "; cursor.moveToFirst() == " + cursor.moveToFirst());
            if (setDialogInputReturnMsgIfErr()) return;
            insertToDB();
            dialog.dismiss();
            activity.finish();
        });
    }

    private void updateDB() {
        sqLiteDatabase.execSQL(sqlHelper.updateCL_SQL(
                id_1_value, id_2_value, id_3_value, id_108_value, id_9_value, id_10_value, id_15_value, id_16_value,
                1, 1, id_103_value, 1, 1, id_106_value, 1,
                id_22_value, id_23_value,
                id_24_value, id_25_value, id_36_value, id_38_value, id_41_value, id_43_value, id_45_value, id_62_value, id_63_value,
                id_66_value, id_69_position, id_4001_value, id_4002_value, id_4003_value, id_4004_value, id_4005_value, id_4006_value,
                id_4007_value, id_4008_value, id_4009_value, id_4010_value,
                savedVersionTitle,
                moduleActiveId,
                categoryActiveId,
                subCategoryActiveId));
        new SQLRemote(QUERY_TYPE_UPDATE_VALUES_OUTSIDE, false).execute(moduleActiveId+"", categoryActiveId +"", subCategoryActiveId +"", savedVersionTitle);
    }

    private void insertToDB() {
        sqLiteDatabase.execSQL(sqlHelper.insertPenetration_SQL(DialogHelper.input, moduleActiveId, categoryActiveId, subCategoryActiveId,
                id_1_value, id_2_value, id_3_value, id_108_value,
                id_9_value, id_10_value, id_15_value, id_16_value, 1,1,id_103_value,1,1,id_106_value,1,
                id_22_value, id_23_value,
                id_24_value, id_25_value, id_36_value, id_38_value,
                id_41_value, id_43_value, id_45_value, id_62_value,
                id_63_value, id_66_value, id_69_position, id_4001_value,
                id_4002_value, id_4003_value, id_4004_value, id_4005_value,
                id_4006_value, id_4007_value, id_4008_value, id_4009_value,
                id_4010_value));
        new SQLRemote(QUERY_TYPE_INSERT_VALUES_OUTSIDE, false).execute(moduleActiveId+"", categoryActiveId +"", subCategoryActiveId +"", DialogHelper.input);
    }

    private String mathId_108() {
        try {
            id_108_value = id_25_value == 1.4
                    ? 2 * Math.PI * id_103_value * 0.75 +
                    (id_106_value > 0 ? (id_103_value > id_106_value ? 2 * id_106_value : Math.PI * id_103_value * 0.5) : 0)
                    : 2 * Math.PI * id_103_value * 0.5 + (id_106_value > 0 ? (id_103_value > id_106_value ? 2 * id_106_value
                    : Math.PI * id_103_value *0.5)
                    : 0);
            Log.d("checkMath", "mathId_108() -> id_108_value == " + id_108_value +"; id_103_value == " + id_103_value +"; id_106_value == " + id_106_value +"; id_25_value == " + id_25_value);
            if (Double.isNaN(id_108_value)) throw new NumberFormatException(NaN);
            return formatNumberDecimal(id_108_value);
        } catch (NumberFormatException e){
            Log.d("checkMath", "mathId_108() -> EXCEPTION -> " + e.getMessage());
            return context.getString(R.string.not_valid_cut);
        }
    }

    public void valueNumberChangedListener(double valueItemNumber, int valueItemId, int spinnerPosition) {
        Log.d("numberChangedListener", "CanopyLengthsCategory{} -> valueItemNumber == " + valueItemNumber + "; valueItemId == " + valueItemId + "; numberPickerPosition == " + spinnerPosition);

        switch (valueItemId) {
            case 1:
                id_1_value = valueItemNumber;
                setRelevantResultItem_value(4, mathId_4(), "");
                setRelevantResultItem_value(5, mathId_5(), "");
                setRelevantResultItem_value(6, mathId_6(), "");
                setRelevantResultItem_value(7, mathId_7(), "");
                setRelevantResultItem_value(13, mathId_13(), "");
                setRelevantResultItem_value(14, mathId_14(), "");
                setRelevantResultItem_value(19, mathId_19(), "");
                setRelevantResultItem_value(20, mathId_20(), "");
                setRelevantResultItem_value(21, mathId_21(), "");
                setRelevantResultItem_value(30, mathId_30(), "");
                setRelevantResultItem_value(31, mathId_31(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(37, mathId_37(), "");
                setRelevantResultItem_value(39, mathId_39(), "");
                setRelevantResultItem_value(40, mathId_40(), "");
                setRelevantResultItem_value(42, mathId_42(), "");
                setRelevantResultItem_value(46, mathId_46(), "");
                setRelevantResultItem_value(50, mathId_50(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(53, mathId_53(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(51, mathId_51(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(57, mathId_57(), "");
                setRelevantResultItem_value(58, mathId_58(2), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(1000, mathId_1000(), "");
                setRelevantResultItem_value(2000, mathId_2000(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");
                setRelevantResultItem_value(5000, mathId_5000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");
                break;
            case 2:
                id_2_value = valueItemNumber;
                setRelevantResultItem_value(5, mathId_5(), "");
                setRelevantResultItem_value(7, mathId_7(), "");
                setRelevantResultItem_value(13, mathId_13(), "");
                setRelevantResultItem_value(14, mathId_14(), "");
                setRelevantResultItem_value(21, mathId_21(), "");
                setRelevantResultItem_value(30, mathId_30(), "");
                setRelevantResultItem_value(31, mathId_31(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(37, mathId_37(), "");
                setRelevantResultItem_value(39, mathId_39(), "");
                setRelevantResultItem_value(40, mathId_40(), "");
                setRelevantResultItem_value(42, mathId_42(), "");
                setRelevantResultItem_value(44, mathId_44(), "");
                setRelevantResultItem_value(46, mathId_46(), "");
                setRelevantResultItem_value(50, mathId_50(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(53, mathId_53(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(51, mathId_51(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(57, mathId_57(), "");
                setRelevantResultItem_value(58, mathId_58(2), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(1000, mathId_1000(), "");
                setRelevantResultItem_value(2000, mathId_2000(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");
                setRelevantResultItem_value(5000, mathId_5000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 3:
                id_3_value = valueItemNumber;
                setRelevantResultItem_value(6, mathId_6(), "");
                setRelevantResultItem_value(7, mathId_7(), "");
                setRelevantResultItem_value(19, mathId_19(), "");
                setRelevantResultItem_value(20, mathId_20(), "");
                setRelevantResultItem_value(21, mathId_21(), "");
                setRelevantResultItem_value(30, mathId_30(), "");
                setRelevantResultItem_value(31, mathId_31(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(37, mathId_37(), "");
                setRelevantResultItem_value(39, mathId_39(), "");
                setRelevantResultItem_value(40, mathId_40(), "");
                setRelevantResultItem_value(42, mathId_42(), "");
                setRelevantResultItem_value(44, mathId_44(), "");
                setRelevantResultItem_value(46, mathId_46(), "");
                setRelevantResultItem_value(50, mathId_50(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(53, mathId_53(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(51, mathId_51(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(57, mathId_57(), "");
                setRelevantResultItem_value(58, mathId_58(2), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(1000, mathId_1000(), "");
                setRelevantResultItem_value(2000, mathId_2000(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");
                setRelevantResultItem_value(5000, mathId_5000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 9:
                id_9_position = spinnerPosition;
                id_9_value = Double.parseDouble(getFrom_7_5_to_20_stringValues()[spinnerPosition]);
                setRelevantResultItem_value(11, mathId_11(), "");
                setRelevantResultItem_value(12, mathId_12(), "");
                setRelevantResultItem_value(13, mathId_13(), "");
                setRelevantResultItem_value(14, mathId_14(), "");
                setRelevantResultItem_value(21, mathId_21(), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 10:
                id_10_position = spinnerPosition;
                id_10_value = Double.parseDouble(getFrom_8_to_25_stringValues()[spinnerPosition]);
                setRelevantResultItem_value(11, mathId_11(), "");
                setRelevantResultItem_value(12, mathId_12(), "");
                setRelevantResultItem_value(13, mathId_13(), "");
                setRelevantResultItem_value(14, mathId_14(), "");
                setRelevantResultItem_value(21, mathId_21(), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 15:
                id_15_position = spinnerPosition;
                id_15_value = Double.parseDouble(getFrom_7_5_to_20_stringValues()[spinnerPosition]);
                setRelevantResultItem_value(17, mathId_17(), "");
                setRelevantResultItem_value(18, mathId_18(), "");
                setRelevantResultItem_value(19, mathId_19(), "");
                setRelevantResultItem_value(20, mathId_20(), "");
                setRelevantResultItem_value(21, mathId_21(), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 16:
                id_16_position = spinnerPosition;
                id_16_value = Double.parseDouble(getFrom_8_to_25_stringValues()[spinnerPosition]);
                setRelevantResultItem_value(17, mathId_17(), "");
                setRelevantResultItem_value(18, mathId_18(), "");
                setRelevantResultItem_value(19, mathId_19(), "");
                setRelevantResultItem_value(20, mathId_20(), "");
                setRelevantResultItem_value(21, mathId_21(), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 103:
                id_103_value = valueItemNumber;
                setRelevantResultItem_value(108, mathId_108(), "");
                setRelevantResultItem_value(31, mathId_31(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(58, mathId_58(2), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(2000, mathId_2000(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");
                setRelevantResultItem_value(5000, mathId_5000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");
                break;
            case 106:
                id_106_value = valueItemNumber;
                setRelevantResultItem_value(108, mathId_108(), "");
                setRelevantResultItem_value(31, mathId_31(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(58, mathId_58(2), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(2000, mathId_2000(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");
                setRelevantResultItem_value(5000, mathId_5000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 22:
                id_22_position = spinnerPosition;
                id_22_value = getConcreteTypeDoubleValues()[spinnerPosition];
                id_26_value = id_22_value;
                setRelevantResultItem_value(26, id_26_value+"", "");
                setRelevantResultItem_value(27, mathId_27(), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(47, mathId_47(), "");
                setRelevantResultItem_value(49, mathId_49(), "");
                setRelevantResultItem_value(50, mathId_50(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(51, mathId_51(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 23:
                id_23_position = spinnerPosition;
                id_23_value = Double.parseDouble(getFrom_400_to_500_stringValues()[spinnerPosition]);
                setRelevantResultItem_value(28, mathId_28(), "");
                setRelevantResultItem_value(47, mathId_47(), "");
                setRelevantResultItem_value(49, mathId_49(), "");
                setRelevantResultItem_value(50, mathId_50(), "");
                setRelevantResultItem_value(53, mathId_53(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(51, mathId_51(), "");
                setRelevantResultItem_value(61, mathId_61(), "");
                setRelevantResultItem_value(65, mathId_65(), "");
                setRelevantResultItem_value(68, mathId_68(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 24:
                id_24_value = valueItemNumber;
                setRelevantResultItem_value(29, mathId_29(), "");
                setRelevantResultItem_value(33, mathId_33(), "");
                setRelevantResultItem_value(35, mathId_35(), "");
                setRelevantResultItem_value(52, mathId_52(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(55, mathId_55(), "");
                setRelevantResultItem_value(56, mathId_56(), "");
                setRelevantResultItem_value(59, mathId_59(2), "");
                setRelevantResultItem_value(60, mathId_60(), "");
                setRelevantResultItem_value(61, mathId_61(), "");
                setRelevantResultItem_value(65, mathId_65(), "");
                setRelevantResultItem_value(68, mathId_68(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 25:
                id_25_position = spinnerPosition;
                id_25_value = Double.parseDouble(getFrom_1_4_to_1_5_stringValues()[spinnerPosition]);
                setRelevantResultItem_value(108, mathId_108(), "");
                setRelevantResultItem_value(29, mathId_29(), "");
                setRelevantResultItem_value(31, mathId_31(id_25_value == 1.4 ? 0.75 : 0.5), "");
                setRelevantResultItem_value(32, mathId_32(), "");
                setRelevantResultItem_value(34, mathId_34(), "");
                setRelevantResultItem_value(58, mathId_58(2), "");
                setRelevantResultItem_value(2000, mathId_2000(id_25_value == 1.4 ? 0.75 : 0.5), "");

                break;
            case 36:
                id_36_value = Double.parseDouble(getFrom_8_to_25_stringValues()[spinnerPosition]);
                id_36_position = spinnerPosition;
                setRelevantResultItem_value(48, mathId_48(), "");
                setRelevantResultItem_value(49, mathId_49(), "");
                setRelevantResultItem_value(50, mathId_50(), "");
                setRelevantResultItem_value(51, mathId_51(), "");
                setRelevantResultItem_value(6000, mathId_6000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 38:
                id_38_value = valueItemNumber;
                setRelevantResultItem_value(39, mathId_39(), "");
                setRelevantResultItem_value(48, mathId_48(), "");
                setRelevantResultItem_value(49, mathId_49(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(1000, mathId_1000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");

                break;
            case 41:
                id_41_value = valueItemNumber;
                setRelevantResultItem_value(42, mathId_42(), "");
                setRelevantResultItem_value(48, mathId_48(), "");
                setRelevantResultItem_value(49, mathId_49(), "");
                setRelevantResultItem_value(51, mathId_51(), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");
                setRelevantResultItem_value(5000, mathId_5000(), "");

                break;
            case 43:
                id_43_value = Double.parseDouble(getFrom_45_to_90_stringValues()[spinnerPosition]);
                id_43_position = spinnerPosition;
                setRelevantResultItem_value(48, mathId_48(), "");
                setRelevantResultItem_value(49, mathId_49(), "");
                setRelevantResultItem_value(54, mathId_54(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");

                break;
            case 45:
                id_45_value = valueItemNumber;
                setRelevantResultItem_value(46, mathId_46(), "");
                setRelevantResultItem_value(3000, mathId_3000(), "");
                setRelevantResultItem_value(5000, mathId_5000(), "");

                break;
            case 62:
                id_62_position = spinnerPosition;
                id_62_value = Double.parseDouble(getFrom_8_to_25_stringValues()[id_62_position]);
                setRelevantResultItem_value(64, mathId_64(), "");
                setRelevantResultItem_value(65, mathId_65(), "");
                setRelevantResultItem_value(67, mathId_67(), "");
                setRelevantResultItem_value(68, mathId_68(), "");
                break;
            case 63:
                id_63_value = valueItemNumber;
                setRelevantResultItem_value(64, mathId_64(), "");
                setRelevantResultItem_value(65, mathId_65(), "");
                setRelevantResultItem_value(68, mathId_68(), "");

                break;
            case 66:
                id_66_value = valueItemNumber;
                setRelevantResultItem_value(67, mathId_67(), "");
                setRelevantResultItem_value(68, mathId_68(), "");

                break;
            case 69:
                id_69_position = spinnerPosition;
                setOnId_69_ChangedAction(id_25_value == 1.4 ? 0.75 : 0.5);
                break;
            case 4000:
                set_4000_valueAndPosition(spinnerPosition);
                setRelevantResultItem_value(5000, mathId_5000(), "");
                setRelevantResultItem_value(6000, mathId_6000(), "");
                setRelevantResultItem_value(7000, mathId_7000(), "");
                break;
        }
    }

}
