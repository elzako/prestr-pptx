package com.aspose.slides.internal.r4;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.l7h.j5;

public class t9 {
   private byte[] n5;
   private j5 l6;
   private Exception k5;
   private String u3;

   public t9(byte[] var1) {
      this(var1, j5.u3(1252));
      this.n5 = var1;
   }

   public t9(byte[] var1, j5 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final byte[] n5() {
      return this.n5;
   }

   public final void n5(Exception var1) {
      this.k5 = var1;
   }

   public final j5 l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }
}
