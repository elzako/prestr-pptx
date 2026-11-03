package com.aspose.slides;

import java.awt.geom.Point2D.Float;
import java.util.Date;

public class Comment implements IComment, r0g {
   private int n5;
   private CommentCollection l6;
   private r2q k5 = new r2q();
   private String u3;
   private com.aspose.slides.ms.System.j5 a6 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.internal.o9b.w1 u9 = new com.aspose.slides.internal.o9b.w1();
   private Slide h0;
   private CommentAuthor c8;
   private IComment t2;

   @Override
   public final String getText() {
      return this.u3;
   }

   @Override
   public final void setText(String value) {
      this.u3 = value;
   }

   @Override
   public final Date getCreatedTime() {
      return com.aspose.slides.ms.System.j5.k5(this.n5());
   }

   com.aspose.slides.ms.System.j5 n5() {
      return this.a6;
   }

   @Override
   public final void setCreatedTime(Date value) {
      this.n5(com.aspose.slides.ms.System.j5.n5(value));
   }

   void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.a6);
   }

   @Override
   public final ISlide getSlide() {
      return this.h0;
   }

   @Override
   public final ICommentAuthor getAuthor() {
      return this.c8;
   }

   @Override
   public final Float getPosition() {
      return com.aspose.slides.internal.o9b.w1.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.w1 l6() {
      return this.u9;
   }

   @Override
   public final void setPosition(Float value) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.u9);
   }

   @Override
   public final void remove() {
      if (this.l6 == null) {
         throw new PptxEditException("Comment is already removed from collection.");
      }

      synchronized (this.l6.getSyncRoot()) {
         IComment[] var2 = this.getSlide().getSlideComments(null);

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].getParentComment() == this) {
               var2[var3].remove();
            }
         }

         this.l6.n5(this);
         ((Slide)this.getSlide()).l6(this);
         this.l6 = null;
      }
   }

   @Override
   public final IComment getParentComment() {
      return this.t2;
   }

   @Override
   public final void setParentComment(IComment value) {
      IComment var2 = value;

      while (var2.getParentComment() != null) {
         var2 = var2.getParentComment();
         if (com.aspose.slides.ms.System.j8.l6(this, var2)) {
            throw new PptxEditException("Setting this value leads to a circular reference!");
         }
      }

      this.t2 = value;
   }

   final int k5() {
      return this.n5;
   }

   final void n5(int var1) {
      this.n5 = var1;
   }

   Comment(
      CommentCollection parentImmediate,
      CommentAuthor author,
      String text,
      Slide slide,
      com.aspose.slides.internal.o9b.w1 position,
      com.aspose.slides.ms.System.j5 dateTime
   ) {
      this.l6 = parentImmediate;
      this.c8 = author;
      this.u3 = text;
      this.h0 = slide;
      position.n5(this.u9);
      dateTime.u3(this.a6);
      long var7 = (author.l6().k5() & 4294967295L) + 1L;
      author.l6().l6(var7);
      this.u3().n5(var7);
   }

   final r2q u3() {
      return this.k5;
   }

   @Override
   public r0g getParent_Immediate() {
      return this.l6;
   }
}
