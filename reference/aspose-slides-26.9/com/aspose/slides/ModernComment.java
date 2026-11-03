package com.aspose.slides;

public final class ModernComment extends Comment implements IModernComment, r0g {
   private CommentCollection n5;
   private r9m l6 = new r9m();
   private Shape k5;
   private int u3;
   private int a6;
   private byte u9;
   private com.aspose.slides.ms.System.o0 h0 = new com.aspose.slides.ms.System.o0();

   @Override
   public final IShape getShape() {
      return this.k5;
   }

   @Override
   public final int getTextSelectionStart() {
      return this.u3;
   }

   @Override
   public final void setTextSelectionStart(int value) {
      this.u3 = value;
   }

   @Override
   public final int getTextSelectionLength() {
      return this.a6;
   }

   @Override
   public final void setTextSelectionLength(int value) {
      this.a6 = value;
   }

   @Override
   public final byte getStatus() {
      return this.u9;
   }

   @Override
   public final void setStatus(byte value) {
      this.u9 = value;
   }

   final com.aspose.slides.ms.System.o0 a6() {
      return this.h0;
   }

   final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.h0);
   }

   ModernComment(
      CommentCollection parentImmediate,
      CommentAuthor author,
      String text,
      Slide slide,
      Shape shape,
      com.aspose.slides.internal.o9b.w1 position,
      com.aspose.slides.ms.System.j5 dateTime
   ) {
      super(parentImmediate, author, text, slide, position.u3(), dateTime.m3());
      this.k5 = shape;
      this.n5(com.aspose.slides.ms.System.o0.l6().k5());
   }

   final r9m u9() {
      return this.l6;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.n5;
   }
}
