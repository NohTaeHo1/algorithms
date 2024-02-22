package kaupOOP;

import mamberOOP.MemberModel;

public class KaupServiceImpl implements KaupService{
    MemberModel mm = new MemberModel();
    @Override
    public double createbmi() {
        double bmi = mm.getWeight()/(mm.getHeight()*mm.getHeight()*10000);
        return bmi;
    }

    @Override
    public String createbodyMass() {
        String a = "";
        if(mm.getWeight()/(mm.getHeight()*mm.getHeight()*10000)<18.5){
            a = "저체중입니다";
        }
        else if (mm.getWeight()/(mm.getHeight()*mm.getHeight()*10000)<23){
            a = "정상입니다";
        }
        else if (mm.getWeight()/(mm.getHeight()*mm.getHeight()*10000)<25){
            a = "과체중입니다";
        }
        else{
            a = "비만입니다";
        }
        return a;

    }
}
