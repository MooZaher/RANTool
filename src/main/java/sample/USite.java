package sample;

import Helpers.Constants;

import java.util.ArrayList;

public class USite {

    private String siteName, siteCode, siteRegion, siteRncId, siteWbtsId, siteVersion;
    private int siteNumberOfNodeBs, siteNumberOfSectors, siteNumberOfCells,
            siteNumberOfCarriers, siteNumberOfE1s, siteNumberOfOnAirCells, siteNumberOfFirstCarriersCells, siteNumberOfOnAirFirstCarriersCells,
            siteNumberOfSecondCarriersCells, siteNumberOfOnAirSecondCarriersCells, siteNumberOfThirdCarriersCells, siteNumberOfOnAirThirdCarriersCells,
            siteNumberOfU900CarriersCells, siteNumberOfOnAirU900CarriersCells, siteNumberOfOffAirCells,
            siteNumberOfHSDPASet1, siteNumberOfHSDPASet2, siteNumberOfHSDPASet3, siteNumberOfHSUPASet1,
            siteNumberOfChannelElements;
    double sitePower, siteU900Power;
    double processingSetsIdentifier, channelElementsIdentifier, carriersIdentifier, powerIdentifier;
    private ArrayList<NodeB> nodeBsList;
    private boolean firstCarrier;
    private boolean u900;
    private boolean rfSharing;
    private boolean standAloneU900;
    private UHardware uHardware;



    private enum onOff {ON_AIR, OFF_AIR}

    private Constants.uTxMode siteTxMode;

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public int getSiteNumberOfCells() {
        return siteNumberOfCells;
    }

    public void setSiteNumberOfCells(int siteNumberOfCells) {
        this.siteNumberOfCells = siteNumberOfCells;
    }

    public int getSiteNumberOfOnAirCells() {
        return siteNumberOfOnAirCells;
    }

    public void setSiteNumberOfOnAirCells(int siteNumberOfOnAirCells) {
        this.siteNumberOfOnAirCells = siteNumberOfOnAirCells;
    }

    public int getSiteNumberOfFirstCarriersCells() {
        return siteNumberOfFirstCarriersCells;
    }

    public void setSiteNumberOfFirstCarriersCells(int siteNumberOfFirstCarriersCells) {
        this.siteNumberOfFirstCarriersCells = siteNumberOfFirstCarriersCells;
    }

    public int getSiteNumberOfOnAirFirstCarriersCells() {
        return siteNumberOfOnAirFirstCarriersCells;
    }

    public void setSiteNumberOfOnAirFirstCarriersCells(int siteNumberOfOnAirFirstCarriersCells) {
        if (siteNumberOfOnAirFirstCarriersCells > 0) {
            this.firstCarrier = true;
            this.siteNumberOfCarriers++;
        }
        this.siteNumberOfOnAirFirstCarriersCells = siteNumberOfOnAirFirstCarriersCells;

    }

    public int getSiteNumberOfSecondCarriersCells() {
        return siteNumberOfSecondCarriersCells;
    }

    public void setSiteNumberOfSecondCarriersCells(int siteNumberOfSecondCarriersCells) {
        this.siteNumberOfSecondCarriersCells = siteNumberOfSecondCarriersCells;
    }

    public int getSiteNumberOfOnAirSecondCarriersCells() {
        return siteNumberOfOnAirSecondCarriersCells;
    }

    public void setSiteNumberOfOnAirSecondCarriersCells(int siteNumberOfOnAirSecondCarriersCells) {
        if (siteNumberOfOnAirSecondCarriersCells > 0) {
            boolean secondCarrier = true;
            this.siteNumberOfCarriers++;
        }
        this.siteNumberOfOnAirSecondCarriersCells = siteNumberOfOnAirSecondCarriersCells;
    }

    public int getSiteNumberOfThirdCarriersCells() {
        return siteNumberOfThirdCarriersCells;
    }

    public void setSiteNumberOfThirdCarriersCells(int siteNumberOfThirdCarriersCells) {
        this.siteNumberOfThirdCarriersCells = siteNumberOfThirdCarriersCells;
    }

    public int getSiteNumberOfOnAirThirdCarriersCells() {
        return siteNumberOfOnAirThirdCarriersCells;
    }

    public void setSiteNumberOfOnAirThirdCarriersCells(int siteNumberOfOnAirThirdCarriersCells) {
        if (siteNumberOfOnAirThirdCarriersCells > 0) {
            boolean thirdCarrier = true;
            this.siteNumberOfCarriers++;
        }
        this.siteNumberOfOnAirThirdCarriersCells = siteNumberOfOnAirThirdCarriersCells;
    }

    public int getSiteNumberOfU900CarriersCells() {
        return siteNumberOfU900CarriersCells;
    }

    public void setSiteNumberOfU900CarriersCells(int siteNumberOfU900CarriersCells) {
        this.siteNumberOfU900CarriersCells = siteNumberOfU900CarriersCells;
    }

    public int getSiteNumberOfOnAirU900CarriersCells() {
        return siteNumberOfOnAirU900CarriersCells;
    }

    public void setSiteNumberOfOnAirU900CarriersCells(int siteNumberOfOnAirU900CarriersCells) {
        if (siteNumberOfOnAirU900CarriersCells > 0) {
            this.u900 = true;
            this.siteNumberOfCarriers++;
        }
        this.siteNumberOfOnAirU900CarriersCells = siteNumberOfOnAirU900CarriersCells;
    }

    public int getSiteNumberOfHSDPASet1() {
        return siteNumberOfHSDPASet1;
    }

    public void setSiteNumberOfHSDPASet1(int siteNumberOfHSDPASet1) {
        if (siteNumberOfHSDPASet1 < 0)
            this.siteNumberOfHSDPASet1 = 0;
        else
            this.siteNumberOfHSDPASet1 = siteNumberOfHSDPASet1;
    }

    public int getSiteNumberOfHSDPASet2() {
        return siteNumberOfHSDPASet2;
    }

    public void setSiteNumberOfHSDPASet2(int siteNumberOfHSDPASet2) {
        if (siteNumberOfHSDPASet2 < 0)
            this.siteNumberOfHSDPASet2 = 0;
        else
            this.siteNumberOfHSDPASet2 = siteNumberOfHSDPASet2;
    }

    public int getSiteNumberOfHSDPASet3() {
        return siteNumberOfHSDPASet3;
    }

    public void setSiteNumberOfHSDPASet3(int siteNumberOfHSDPASet3) {
        if (siteNumberOfHSDPASet3 < 0)
            this.siteNumberOfHSDPASet3 = 0;
        else
            this.siteNumberOfHSDPASet3 = siteNumberOfHSDPASet3;
    }

    public int getSiteNumberOfHSUPASet1() {
        return siteNumberOfHSUPASet1;
    }

    public void setSiteNumberOfHSUPASet1(int siteNumberOfHSUPASet1) {
        if (siteNumberOfHSUPASet1 < 0)
            this.siteNumberOfHSUPASet1 = 0;
        else
            this.siteNumberOfHSUPASet1 = siteNumberOfHSUPASet1;
    }

    public int getSiteNumberOfChannelElements() {
        return siteNumberOfChannelElements;
    }

    public void setSiteNumberOfChannelElements(int siteNumberOfChannelElements) {
        this.siteNumberOfChannelElements = siteNumberOfChannelElements;
    }

    public int getSiteNumberOfE1s() {
        return siteNumberOfE1s;
    }

    public void setSiteNumberOfE1s(int siteNumberOfE1s) {
        this.siteNumberOfE1s = siteNumberOfE1s;
    }

    public String getSiteTxMode() {
        return siteTxMode.toString();
    }

    public void setSiteTxMode(String value) {
        try {
            switch (value) {
                case "0":
                    siteTxMode = Constants.uTxMode.ATM;
                    break;
                case "38":
                    siteTxMode = Constants.uTxMode.DUAL_STACK;
                    break;
                default:
                    siteTxMode = Constants.uTxMode.FULL_IP;
            }
        } catch (NullPointerException e) {
            siteTxMode = Constants.uTxMode.FULL_IP;
        }
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getSiteRncId() {
        return siteRncId;
    }

    public void setSiteRncId(String siteRncId) {
        this.siteRncId = siteRncId;
    }

    public String getSiteWbtsId() {
        return siteWbtsId;
    }

    public void setSiteWbtsId(String siteWbtsId) {
        this.siteWbtsId = siteWbtsId;
    }

    public String getSiteVersion() {
        return siteVersion;
    }

    public void setSiteVersion(String siteVersion) {
        this.siteVersion = siteVersion;
    }

    public int getSiteNumberOfNodeBs() {
        return siteNumberOfNodeBs;
    }

    public void setSiteNumberOfNodeBs(int siteNumberOfNodeBs) {
        this.siteNumberOfNodeBs = siteNumberOfNodeBs;
    }

    public int getSiteNumberOfSectors() {
        return siteNumberOfSectors;
    }

    public void setSiteNumberOfSectors() {
        if (firstCarrier)
            this.siteNumberOfSectors = this.siteNumberOfOnAirFirstCarriersCells;
        else if (u900) {
            this.siteNumberOfSectors = this.siteNumberOfOnAirU900CarriersCells;
            this.standAloneU900 = true;
        }
    }

    public double getSitePower() {
        return sitePower;
    }

    public void setSitePower(int sitePower, int vam) {
        int vamCoeff = 1;
        if (vam > 0)
            vamCoeff = 2;
        if (sitePower == 210)
            this.sitePower = vamCoeff * .125;
        else if (sitePower == 240)
            this.sitePower = vamCoeff * 0.25;
        else if (sitePower == 400)
            this.sitePower = vamCoeff * 10;
        else if (sitePower == 418)
            this.sitePower = vamCoeff * 15;
        else if (sitePower == 430)
            this.sitePower = vamCoeff * 20;
        else if (sitePower == 442)
            this.sitePower = vamCoeff * 26.65;
        else if (sitePower == 448 || sitePower == 450)
            this.sitePower = vamCoeff * 30;
        else if (sitePower == 460)
            this.sitePower = vamCoeff * 40;
        else if (sitePower == 478)
            this.sitePower = 60;
        else if (sitePower == 490)
            this.sitePower = 80;
        else if (sitePower == 65535 || sitePower == 0)
            this.sitePower = 0;
    }

    public double getSiteU900Power() {
        return siteU900Power;
    }

    public void setSiteU900Power(int siteU900Power, int vam) {
        int vamCoeff = 1;
        if (vam > 0)
            vamCoeff = 2;
        if (siteU900Power == 430)
            this.siteU900Power = vamCoeff * 20;
        else if (siteU900Power == 442)
            this.siteU900Power = vamCoeff * 26.65;
        else if (siteU900Power == 448 || siteU900Power == 450)
            this.siteU900Power = vamCoeff * 30;
        else if (siteU900Power == 460)
            this.siteU900Power = vamCoeff * 40;
        else if (siteU900Power == 478)
            this.siteU900Power = 60;
        else if (siteU900Power == 490)
            this.siteU900Power = 80;
        else if (siteU900Power == 65535 || siteU900Power == 0)
            this.siteU900Power = 0;
    }

    public int getSiteNumberOfCarriers() {
        return siteNumberOfCarriers;
    }

    public boolean isStandAloneU900() {
        return standAloneU900;
    }

    public void setStandAloneU900() {
        if (!firstCarrier && u900)
            this.standAloneU900 = true;
    }

    public String getSiteRegion() {
        return siteRegion;
    }

    private void setRegion() {
        if (siteCode != null) {
            try {
                String region = siteCode.substring(siteCode.length() - 2);
                if (region.equalsIgnoreCase("UP") || region.equalsIgnoreCase("SI") || region.equalsIgnoreCase("RE")
                        || region.equalsIgnoreCase("DE") || region.equalsIgnoreCase("AL"))
                    this.siteRegion = region;
                else {
                    switch (this.siteRncId) {
                        case "30":
                        case "22":
                        case "38":
                        case "48":
                            this.siteRegion = "AL";
                        case "36":
                        case "54":
                        case "28":
                        case "46":
                        case "52":
                        case "44":
                        case "24":
                        case "4":
                        case "56":
                            this.siteRegion = "DE";
                        case "26":
                        case "18":
                            this.siteRegion = "RE";
                        case "14":
                        case "34":
                        case "50":
                        case "58":
                        case "60":
                        case "62":
                            this.siteRegion = "UP";
                    }
                }
            } catch (StringIndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println(this.siteCode);
                this.siteRegion = "";
            }

        }
    }

    public boolean isRfSharing() {
        return rfSharing;
    }

    public void setRfSharing(int cSharing) {
        if (cSharing > 0)
            this.rfSharing = true;
    }

    public UHardware getUHardware() {
        return uHardware;
    }

    public void setUHardware(UHardware uHardware) {
        this.uHardware = uHardware;
    }

    public void finalizeProperties() {
        this.setSiteNumberOfSectors();
        this.setStandAloneU900();
        this.setRegion();
        setIdentifiers();
    }

    private void setIdentifiers() {
        processingSetsIdentifier = 0.01 * siteNumberOfHSDPASet1 + 0.1 * siteNumberOfHSDPASet2 + siteNumberOfHSDPASet3
                + 10 * siteNumberOfHSUPASet1;
        channelElementsIdentifier = siteNumberOfChannelElements;
        carriersIdentifier = 0.01 * siteNumberOfOnAirFirstCarriersCells + 0.1 * siteNumberOfOnAirSecondCarriersCells
                + siteNumberOfOnAirThirdCarriersCells + 10 * siteNumberOfOnAirU900CarriersCells;
        powerIdentifier = 0.1 * sitePower + siteU900Power;
    }

    public static class UHardware {
        int FBBA, FRGC, FRGD, FRGF, FRGL, FRGM, FRGP, FRGT, FRGU, FRGX,
                FSMB, FSMD, FSME, FSMF, FTIA, FTIB, FTIF, FTPB, FXDA, FXDB;
        double rFModuleIdentifier, systemModuleIdentifier, systemModuleExtentionIdentifier, transmissionModuleIdentifier;
        String rfString, smString;

        public UHardware(int FBBA, int FRGC, int FRGD, int FRGF, int FRGL, int FRGM, int FRGP, int FRGT, int FRGU, int FRGX,
                         int FSMB, int FSMD, int FSME, int FSMF, int FTIA, int FTIB, int FTIF, int FTPB, int FXDA, int FXDB) {
            this.FBBA = FBBA;
            this.FRGC = FRGC;
            this.FRGD = FRGD;
            this.FRGF = FRGF;
            this.FRGL = FRGL;
            this.FRGM = FRGM;
            this.FRGP = FRGP;
            this.FRGT = FRGT;
            this.FRGU = FRGU;
            this.FRGX = FRGX;
            this.FSMB = FSMB;
            this.FSMD = FSMD;
            this.FSME = FSME;
            this.FSMF = FSMF;
            this.FTIA = FTIA;
            this.FTIB = FTIB;
            this.FTIF = FTIF;
            this.FTPB = FTPB;
            this.FXDA = FXDA;
            this.FXDB = FXDB;
            setIdentifiers();
            buildHWText();
        }
        private void buildHWText() {
            getRfModuleString();
            getSModuleString();
        }

        private void getSModuleString() {
            smString = "";
            if (FSMB > 0)
                smString = FSMB + " FSMB ";
            if (FSMD > 0)
                smString = smString + " " + FSMD + "FSMD ";
            if (FSME > 0)
                smString = smString + " " + FSME + "FSME ";
            if (FSMF > 0)
                smString = smString + " " + FSMF + "FSMF ";
            if (FBBA > 0)
                smString = smString + " " + FBBA + "FBBA ";
        }

        private void getRfModuleString() {
            rfString = "";
            if (FRGC > 0)
                rfString = FRGC + "FRGC ";
            if (FRGD > 0)
                rfString = rfString + " " + FRGD + "FRGD ";
            if (FRGF > 0)
                rfString = rfString + " " + FRGF + "FRGF ";
            if (FRGL > 0)
                rfString = rfString + " " + FRGL + "FRGL ";
            if (FRGM > 0)
                rfString = rfString + " " + FRGM + "FRGM ";
            if (FRGP > 0)
                rfString = rfString + " " + FRGP + "FRGP ";
            if (FRGT > 0)
                rfString = rfString + " " + FRGT + "FRGT ";
            if (FRGU > 0)
                rfString = rfString + " " + FRGU + "FRGU ";
            if (FRGX > 0)
                rfString = rfString + " " + FRGX + "FRGX ";
            if (FXDA > 0)
                rfString = rfString + " " + FXDA + "FXDA ";
            if (FXDB > 0)
                rfString = rfString + " " + FXDB + "FXDB ";
        }

        private void setIdentifiers() {
            rFModuleIdentifier = 0.00001 * FRGC + 0.0001 * FRGD + 0.001 * FRGF + 0.01 * FRGL + 0.1 * FRGM +
                    FRGP + 10 * FRGT + 100 * FRGU + 1000 * FRGX + 10000 * FXDA + 100000 * FXDB;
            systemModuleIdentifier = 0.01 * FSMB + 0.1 * FSMD + FSME + 10 * FSMF;
            systemModuleExtentionIdentifier = FBBA;
            transmissionModuleIdentifier = 0.01 * FTIA + 0.1 * FTIB + FTIF + 10 * FTPB;
        }
    }
}