package com.aspose.slides;

public final class PathSegment implements IPathSegment {
   private final float[] n5;
   private final byte l6;

   @Override
   public final float[] getSegmentData() {
      return this.n5;
   }

   @Override
   public final byte getPathCommand() {
      return this.l6;
   }

   PathSegment(byte pathType, float[] segmentData) {
      this.l6 = pathType;
      this.n5 = segmentData;
   }
}
