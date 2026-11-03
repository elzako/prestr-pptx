package com.aspose.slides;

class y2t implements ISlideText {
   private final String n5;
   private final String l6;
   private final String k5;
   private final String u3;
   private final String a6;

   y2t(String var1, String var2, String var3, String var4, String var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   @Override
   public final String getText() {
      return this.n5;
   }

   @Override
   public final String getMasterText() {
      return this.l6;
   }

   @Override
   public final String getLayoutText() {
      return this.k5;
   }

   @Override
   public final String getNotesText() {
      return this.u3;
   }

   @Override
   public final String getCommentsText() {
      return this.a6;
   }
}
