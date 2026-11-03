package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.j3;

@j3
public final class m1 extends ArgumentException {
   private char n5;
   private char l6;
   private char k5;
   private int u3;

   public m1(String var1, char var2, int var3) {
      super(var1);
      this.n5 = var2;
      this.u3 = var3;
   }

   public m1(String var1, char var2, char var3, int var4) {
      super(var1);
      if (!com.aspose.slides.ms.System.t9.a6(var2)) {
         throw new ArgumentOutOfRangeException("charUnknownHigh", o0.n5("Valid values are between {0} and {1}, inclusive.", 55296, 56319));
      }

      if (!com.aspose.slides.ms.System.t9.t2(var3)) {
         throw new ArgumentOutOfRangeException("CharUnknownLow", o0.n5("Valid values are between {0} and {1}, inclusive.", 56320, 57343));
      }

      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }
}
