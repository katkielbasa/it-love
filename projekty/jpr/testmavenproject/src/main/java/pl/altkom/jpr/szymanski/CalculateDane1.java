package pl.altkom.jpr.szymanski;

public class CalculateDane1 {

    public float CalculateDane(Dane dane) {

		// typ 1 - "na teraz", typ 2 - "na dzisiaj", typ 3 - "na jutro"
        if (dane.isInternet() == true) {

            if (dane.getType() == 1) {

                if ((dane.getValue() > 0.01) && (dane.getValue() <= 200)) {
                    return 9.50f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 13f;
                }
                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 15f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 17f;
                }

                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 19f;
                }

                if ((dane.getValue() > 500) && (dane.getValue() <= 1000)) {
                    return 21f;
                }

                if ((dane.getValue() > 1000)) {
                    return 23f;
                }

            } else if (dane.getType() == 2) {

                if ((dane.getValue() > 0.01) && (dane.getValue() <= 200)) {
                    return 8.50f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 11f;
                }
                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 13f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 15f;
                }

                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 17f;
                }

                if ((dane.getValue() > 500) && (dane.getValue() <= 1000)) {
                    return 19f;
                }

                if ((dane.getValue() > 1000)) {
                    return 21f;
                }

            } else if (dane.getType() == 3) {

                if ((dane.getValue() > 0.01) && (dane.getValue() <= 200)) {
                    return 7.50f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 9f;
                }
                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 11f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 13f;
                }

                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 15f;
                }

                if ((dane.getValue() > 500) && (dane.getValue() <= 1000)) {
                    return 17f;
                }

                if ((dane.getValue() > 1000)) {
                    return 19f;
                }

            } else if (dane.getType() == 1) {

                if ((dane.getValue() > 0.01) && (dane.getValue() <= 200)) {
                    return 10.50f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 14f;
                }
                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 16f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 18f;
                }

                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 19f;
                }

                if ((dane.getValue() > 500) && (dane.getValue() <= 1000)) {
                    return 21f;
                }

                if ((dane.getValue() > 1000)) {
                    return 23f;
                }

            } else if (dane.getType() == 2) {

                if ((dane.getValue() > 0.01) && (dane.getValue() <= 200)) {
                    return 8.50f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 11f;
                }
                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 13f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 15f;
                }

                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 17f;
                }

                if ((dane.getValue() > 500) && (dane.getValue() <= 1000)) {
                    return 19f;
                }

                if ((dane.getValue() > 1000)) {
                    return 21f;
                }

            } else if (dane.getType() == 3) {

                if ((dane.getValue() > 0.01) && (dane.getValue() <= 200)) {
                    return 7.50f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 9f;
                }
                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 11f;
                }

                if ((dane.getValue() > 200) && (dane.getValue() <= 300)) {
                    return 13f;
                }

                if ((dane.getValue() > 300) && (dane.getValue() <= 500)) {
                    return 15f;
                }

                if ((dane.getValue() > 500) && (dane.getValue() <= 1000)) {
                    return 17f;
                }

                if ((dane.getValue() > 1000)) {
                    return 19f;
                }

            }

        }
        return 0;
    }
}
