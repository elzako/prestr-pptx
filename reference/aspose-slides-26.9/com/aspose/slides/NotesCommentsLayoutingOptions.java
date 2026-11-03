package com.aspose.slides;

import java.awt.Color;

public class NotesCommentsLayoutingOptions implements ISlidesLayoutOptions {
   private int n5;
   private int l6;
   private int k5;
   private com.aspose.slides.internal.o9b.c8 u3 = new com.aspose.slides.internal.o9b.c8();
   private boolean a6;
   private boolean u9;

   public NotesCommentsLayoutingOptions() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 150;
      com.aspose.slides.internal.o9b.c8.x5().n5(this.u3);
      this.a6 = false;
   }

   public final boolean getShowCommentsByNoAuthor() {
      return this.a6;
   }

   public final void setShowCommentsByNoAuthor(boolean value) {
      this.a6 = value;
   }

   public final int getNotesPosition() {
      return this.n5;
   }

   public final void setNotesPosition(int value) {
      this.n5 = value;
   }

   public final int getCommentsPosition() {
      return this.l6;
   }

   public final void setCommentsPosition(int value) {
      this.l6 = value;
   }

   public final Color getCommentsAreaColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.c8 n5() {
      return this.u3;
   }

   public final void setCommentsAreaColor(Color value) {
      this.n5(com.aspose.slides.internal.o9b.c8.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.u3);
   }

   public final int getCommentsAreaWidth() {
      return this.k5;
   }

   public final void setCommentsAreaWidth(int value) {
      this.k5 = value;
      if (this.k5 < 150) {
         this.k5 = 150;
      }
   }

   final boolean l6() {
      return this.getNotesPosition() != 0 || this.getCommentsPosition() != 0;
   }

   final boolean k5() {
      return this.u9;
   }

   final void n5(boolean var1) {
      this.u9 = var1;
   }
}
