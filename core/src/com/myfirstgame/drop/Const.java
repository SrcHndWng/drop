package com.myfirstgame.drop;

public class Const {
    private Const(){
    }

    public static class Viewport{
        public static final float width = 800.0f;
        public static final float height = 480.0f;
    }

    public static class Bucket{
        public static final float width = 64.0f;
        public static final float height = 64.0f;
        public static final float aboveBottom = 20.0f;
        public static final float slideWidth = 200.0f;
    }

    public static class Raindrop{
        public static final float width = 64.0f;
        public static final float height = 64.0f;
        public static final float slideHeight = 200.0f;
    }

    public static class DispStrings {
        public static class Welcome{
            public static float x = 100.0f;
            public static float y = 150.0f;
        }
        public static class Tap{
            public static float x = 100.0f;
            public static float y = 100.0f;
        }
        public static class DropCount{
            public static float x = 0.0f;
            public static float y = 480.0f;
        }
    }
}
