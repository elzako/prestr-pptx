package com.aspose.slides.internal.a0;

import com.aspose.slides.internal.l7h.a5;

public class s3$k5 {
   private String n5;
   private String l6;

   public s3$k5(String var1, String var2) {
      this.n5(var1);
      this.l6(var2);
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("pvKey=").n5(this.n5);
      var1.n5(",idRef=").n5(this.l6);
      return var1.toString();
   }
}
