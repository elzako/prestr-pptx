package com.aspose.slides;

public final class PptxOptions extends SaveOptions implements IPptxOptions, Cloneable {
   private int n5;
   private int l6;
   private boolean k5;
   private int u3;

   public PptxOptions() {
      this.setConformance(0);
      this.setZip64Mode(1);
      this.setCompressionLevel(6);
      this.setRefreshThumbnail(true);
   }

   @Override
   public final int getConformance() {
      return this.n5;
   }

   @Override
   public final void setConformance(int value) {
      this.n5 = value;
   }

   @Override
   public final int getZip64Mode() {
      return this.l6;
   }

   @Override
   public final void setZip64Mode(int value) {
      this.l6 = value;
   }

   @Override
   public final boolean getRefreshThumbnail() {
      return this.k5;
   }

   @Override
   public final void setRefreshThumbnail(boolean value) {
      this.k5 = value;
   }

   @Override
   public final int getCompressionLevel() {
      return this.u3;
   }

   @Override
   public final void setCompressionLevel(int value) {
      this.u3 = value;
   }

   protected Object memberwiseClone() {
      try {
         return (PptxOptions)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
