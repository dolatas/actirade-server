package model;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class BaseObject implements Serializable{

	public abstract String toString();
	public abstract boolean equals(Object obj);
	public abstract int hashCode();
	
}
