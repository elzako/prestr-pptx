package com.aspose.slides.internal.a0;

import com.aspose.slides.internal.l7h.a5;

public class s3$l6 {
   private String n5;
   private boolean l6;

   public s3$l6(String var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final String n5() {
      return this.n5;
   }

   public final boolean l6() {
      return this.l6;
   }

   @Override
   public String toString() {
      a5 var1 = new a5(64);
      var1.n5("newWindow=").n5(this.l6);
      var1.n5(",dest=").n5(this.n5);
      return var1.toString();
   }
}
