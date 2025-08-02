class Badge {
    public String print(Integer id, String name, String department) {
//        return (id != null ? String.format("[%s] - ", id) : "") + name + " - " + (department != null ? department.toUpperCase() : "OWNER");

        return new StringBuilder()
                .append(id != null ?  String.format("[%s] - ", id):"")
                .append(name).append(" - ")
                .append(department != null ? department.toUpperCase() : "OWNER")
                .toString();
    }
}
