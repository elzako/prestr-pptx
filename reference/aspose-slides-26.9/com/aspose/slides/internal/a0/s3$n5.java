package com.aspose.slides.internal.a0;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.h2.t2$k5;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class s3$n5 {
   private com.aspose.slides.internal.o9b.c8 l6 = com.aspose.slides.internal.o9b.c8.u3.o8();
   private String k5 = null;
   private com.aspose.slides.internal.r4.t2 u3 = null;
   private int a6;
   private int u9;
   private int h0;
   public boolean n5;
   private t2$k5 c8;

   public final com.aspose.slides.internal.o9b.c8 n5() {
      return this.l6;
   }

   public final int l6() {
      return this.u9;
   }

   public final int k5() {
      return this.a6;
   }

   public final String u3() {
      return this.k5;
   }

   public final com.aspose.slides.internal.r4.t2 a6() {
      return this.u3;
   }

   public final t2$k5 u9() {
      return this.c8;
   }

   public final int h0() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.l6);
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final void n5(com.aspose.slides.internal.r4.t2 var1) {
      this.u3 = var1;
   }

   public final void n5(t2$k5 var1) {
      this.c8 = var1;
   }

   public final void k5(int var1) {
      this.h0 = var1;
   }

   private String c8() {
      switch (this.k5()) {
         case 96:
            return "no-repeat";
         case 112:
            return "repeat";
         case 113:
            return "repeat-x";
         case 114:
            return "repeat-y";
         default:
            throw new ArgumentOutOfRangeException(d1.n5(new String[]{"Illegal repeat style: ", a3.l6(this.k5())}));
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      if (!this.l6.t2()) {
         var1.n5("color=").n5(com.aspose.slides.internal.v3.k5.n5(this.l6.o8()));
      }

      if (this.k5 != null) {
         if (!this.l6.t2()) {
            var1.n5(",");
         }

         var1.n5("url=").n5(this.k5);
         var1.n5(",repeat=").n5(this.c8());
         var1.n5(",horiz=").k5(this.u9);
         var1.n5(",vertical=").k5(this.h0);
      }

      return var1.toString();
   }
}
