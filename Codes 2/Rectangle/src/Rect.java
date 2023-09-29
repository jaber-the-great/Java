/**
 * Created by jaberdaneshamooz on 7/16/2017 AD.
 */
public class Rect
    {
        float L;
        float W;
        public Rect()
            {
                this.L=1;
                this.W=1;
            }

        public float perimeter()
            {
                return 2*(this.L+this.W);
            }
        public float area()
            {
                return this.L*this.W;
            }

        public void setL(float l)
            {
                if(l<0 || l>20)
                    throw new IllegalArgumentException("Length can not be negative of very great");

                this.L=l;
            }

        public void setW(float w)
            {
                if(w<0 || w>20)
                    throw new IllegalArgumentException("width can not be negative of very great");

                this.W = w;
            }
    }
