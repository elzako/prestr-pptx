package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.InvalidOperationException;

@com.aspose.slides.ms.System.j3
public class a7 extends InvalidOperationException {
   private u8 n5;
   private int l6 = 16;

   public a7() {
   }

   public a7(String var1) {
      super(var1);
   }

   public a7(String var1, int var2) {
      super(var1);
      this.l6 = var2;
   }

   public a7(String var1, RuntimeException var2, int var3) {
      super(var1, var2);
      this.l6 = var3;
   }

   public a7(String var1, Exception var2, int var3, u8 var4) {
      super(var1, var2);
      this.l6 = var3;
      this.n5 = var4;
   }

   public int n5() {
      return this.l6;
   }
}
