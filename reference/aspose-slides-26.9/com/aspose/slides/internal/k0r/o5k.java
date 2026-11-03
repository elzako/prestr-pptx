package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.Exception;

public class o5k {
   private long n5;
   private int l6 = 0;
   private n9q k5 = new n9q();

   public long n5() {
      return this.n5;
   }

   public void n5(long var1) {
      this.n5 = var1;
   }

   public int l6() {
      return this.l6;
   }

   public void n5(int var1) {
      this.l6 = var1;
      if ((this.l6 & 65535) > 4) {
         this.l6 = 4;
      }
   }

   public n9q k5() {
      return this.k5;
   }

   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.r4();
      this.k5 = new n9q();
      this.k5.n5(var1);
   }

   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.k5.w1()) {
         throw new Exception("Wrong serialized data!!!\nTextPFException within TextPFRun can't have LeftMargin, Indent, DefaultTabSize or TabStops!!!");
      }

      var1.n5(this.n5);
      var1.n5(com.aspose.slides.internal.n8e.v4.n5(this.l6));
      this.k5.n5(var1);
   }

   int u3() {
      return 6 + this.k5.z8();
   }

   boolean n5(o5k var1) {
      return com.aspose.slides.internal.v6g.k5.k5(this.l6, 8) == com.aspose.slides.internal.v6g.k5.k5(var1.l6, 8) && this.k5.k5(var1.k5);
   }
}
