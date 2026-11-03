package com.aspose.slides;

public class NormalViewProperties implements INormalViewProperties {
   private boolean n5;
   private boolean l6;
   private int k5 = 1;
   private int u3 = 2;
   private boolean a6;
   private INormalViewRestoredProperties u9 = new NormalViewRestoredProperties();
   private INormalViewRestoredProperties h0 = new NormalViewRestoredProperties();

   NormalViewProperties() {
      this.u9.setDimensionSize(16.0F);
   }

   @Override
   public final boolean getShowOutlineIcons() {
      return this.n5;
   }

   @Override
   public final void setShowOutlineIcons(boolean value) {
      this.n5 = value;
   }

   @Override
   public final boolean getSnapVerticalSplitter() {
      return this.l6;
   }

   @Override
   public final void setSnapVerticalSplitter(boolean value) {
      this.l6 = value;
   }

   @Override
   public final int getVerticalBarState() {
      return this.k5;
   }

   @Override
   public final void setVerticalBarState(int value) {
      this.k5 = value;
   }

   @Override
   public final int getHorizontalBarState() {
      return this.u3;
   }

   @Override
   public final void setHorizontalBarState(int value) {
      this.u3 = value;
   }

   @Override
   public final boolean getPreferSingleView() {
      return this.a6;
   }

   @Override
   public final void setPreferSingleView(boolean value) {
      this.a6 = value;
   }

   @Override
   public final INormalViewRestoredProperties getRestoredLeft() {
      return this.u9;
   }

   @Override
   public final INormalViewRestoredProperties getRestoredTop() {
      return this.h0;
   }
}
