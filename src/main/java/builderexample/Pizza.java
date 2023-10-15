package main.java.builderexample;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;
    private boolean cheeseCrust;

    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;
        private boolean cheeseCrust = false;

        public Builder() {
        }

        public Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder cheeseCrust(boolean cheeseCrust) {
            this.cheeseCrust = cheeseCrust;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.cheeseCrust = builder.cheeseCrust;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                ", cheeseCrust='" + cheeseCrust +
                '}';
    }
}
