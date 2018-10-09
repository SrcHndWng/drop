package com.myfirstgame.drop;

public class Const {
    private Const(){
    }

    public enum Viewport{
        width(800),
        height(480);

        private final int id;

        private Viewport(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Bucket {
        width(64),
        height(64),
        aboveBottom(20),
        slideWidth(200);

        private final int id;

        private Bucket(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum Raindrop {
        width(64),
        height(64),
        slideHeight(200);

        private final int id;

        private Raindrop(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum WelcomeMenu{
        x(100),
        y(150);

        private final int id;

        private WelcomeMenu(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum TapMenu{
        x(100),
        y(100);

        private final int id;

        private TapMenu(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum DropsCollected{
        x(0),
        y(480);

        private final int id;

        private DropsCollected(final int id) {
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

}
