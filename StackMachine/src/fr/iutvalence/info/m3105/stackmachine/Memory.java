package fr.iutvalence.info.m3105.stackmachine;

public interface Memory {

	public abstract void write(int currentAddress, int instructionParam);

	public abstract int getStartAddress();

}