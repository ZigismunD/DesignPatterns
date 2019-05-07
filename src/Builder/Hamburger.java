package Builder;

import java.util.ArrayList;

public class Hamburger {

    protected Object object;

    public void setSampyla(String sampyla) {
        if (object instanceof ArrayList) {
            ((ArrayList) object).add(sampyla);
        } else if (object instanceof StringBuilder) {
            ((StringBuilder) object).append(sampyla);
        }
    }

    public void setKastike(String kastike) {
        if (object instanceof ArrayList) {
            ((ArrayList) object).add(kastike);
        } else if (object instanceof StringBuilder) {
            ((StringBuilder) object).append(", " + kastike);
        }
    }

    public void setPihvi(String pihvi) {
        if (object instanceof ArrayList) {
            ((ArrayList) object).add(pihvi);
        } else if (object instanceof StringBuilder) {
            ((StringBuilder) object).append(", " + pihvi);
        }
    }

    public void setObject(Boolean onkoMakki) {
        if (onkoMakki) {
            object = new ArrayList<String>();
        } else {
            object = new StringBuilder();
        }
    }

    public Object getObject() {
        return this.object;
    }

}
