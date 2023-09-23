class Magic extends Hero {
    public Magic() {
        super(300, 50, "MAGIC POWER");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + superAbility);
    }
}
