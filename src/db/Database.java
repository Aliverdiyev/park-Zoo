package db;

import model.AquaticCarnivorous;
import model.AquaticNonCarnivorous;
import model.TerrestrialCarnivorous;
import model.TerrestrialNonCarnivorous;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static final List<AquaticCarnivorous> aquaticCarnivorous = new ArrayList<>();
    public static final List<AquaticNonCarnivorous> aquaticNonCarnivorous = new ArrayList<>();
    public static final List<TerrestrialCarnivorous> terrestrialCarnivorous = new ArrayList<>();
    public static final List<TerrestrialNonCarnivorous> terrestrialNonCarnivorous = new ArrayList<>();
}
