package data;

import org.w3c.dom.NameList;

public abstract class NoName extends Pet {
        protected double heSoLuong;
        public NoName(String name, int YOB, double weight) {
            super(name, YOB, weight);
            this.name = name;
            this.YOB = YOB;
            this.weight = weight;
        }
        @Override
        public double run() {
            return weight;
        }
}
