package com.aspose.slides.internal.e5;

import com.aspose.slides.exceptions.InvalidOperationException;

public class m3 extends k5 {
   private boolean n5 = true;
   private char l6;

   public m3(char var1) {
      this.l6 = var1;
   }

   @Override
   public boolean l6() {
      return this.n5;
   }

   @Override
   public char u3() {
      if (this.n5) {
         this.n5 = false;
         return this.l6;
      } else {
         throw new InvalidOperationException();
      }
   }
}
