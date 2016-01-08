package org.codice.imaging.nitf.core;

/**
 * Constants used in symbol parsing.
 */

public final class SymbolConstants {
    // Symbol (Graphic) Segment
    /**
     * Length of the "Symbol Type" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int SYTYPE_LENGTH = 1;

    /**
     * Length of the "Number of Lines Per Symbol" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int NLIPS_LENGTH = 4;

    /**
     * Length of the "Number of Pixels Per Line" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int NPIXPL_LENGTH = 4;

    /**
     * Length of the "Line Width" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int NWDTH_LENGTH = 4;

    /**
     * Length of the "Number of Bits Per Pixel" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int SYNBPP_LENGTH = 1;

    /**
     * Length of the "Symbol Number" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int SNUM_LENGTH = 6;

    /**
     * Length of the "Symbol Rotation" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int SROT_LENGTH = 3;

    /**
     * Length of the "Number of LUT Entries" field in the NITF 2.0 symbol header.
     * <p>
     * See MIL-STD-2500A Table VI and VII.
     */
    protected static final int SYNELUT_LENGTH = 3;

    private SymbolConstants() {
    }
}
