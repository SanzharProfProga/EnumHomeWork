public enum Planet {
    MERCURY ("Эн кичине кун системасындагы планета"),
    VENUS("Кун системасындагы эн ысык планета"),
    EARTH("Кун системасындагы жалгыз  жашоо бар планета"),
    MARS ("Кун системасындагы  эн чон вулкан бар"),
    JUPITER("Кун системасындагы эн чон планета"),
    SATURN("Кун системасындагы эн кооз шакектердин ээси"),
    URANUS("Кун системасындагы муз каптаган гигант планета"),
    NEPTUNE("Кун системасындагы эн алыс планета");
    private  String feature;

    Planet(String feature) {
        this.feature = feature;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }
}
