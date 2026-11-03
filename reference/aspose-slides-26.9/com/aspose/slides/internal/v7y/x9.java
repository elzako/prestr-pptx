package com.aspose.slides.internal.v7y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.Stack;

public class x9 extends w5 {
   public x9(j9 var1, String var2, String var3, int var4) {
      super(var1, var2, var3, var4);
   }

   protected x9(x9 var1) {
      super(var1);
   }

   private boolean n5(com.aspose.slides.internal.x6s.a6 var1, List<com.aspose.slides.internal.x6s.a6> var2) {
      com.aspose.slides.internal.x6s.a6 var3 = var1.n5();
      var3.q0();

      for (int var4 = 0; var4 < var2.size(); var4++) {
         if (var3.l6((com.aspose.slides.internal.x6s.a6)var2.get_Item(var4))) {
            return false;
         }
      }

      var2.addItem(var3);
      return true;
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      super.n5(var1);
      List var2 = new List();
      Stack var3 = new Stack();

      while ((this.l6 = this.n5.h0()) != null) {
         var3.push(this.l6.n5());
      }

      while (var3.size() != 0) {
         com.aspose.slides.internal.x6s.a6 var4 = (com.aspose.slides.internal.x6s.a6)var3.pop();
         if (var4.k5() != 2 && var4.k5() != 3 && this.n5(var4, var2)) {
            com.aspose.slides.internal.x6s.a6 var5 = var4.n5();
            if (var5.q0()) {
               boolean var6 = var5.t4();

               while (!var5.l6(var4)) {
                  if (this.l6(var5)) {
                     this.n5(this.a6, var5);
                  }

                  if (!var5.z1()) {
                     com.aspose.slides.internal.f8y.n5.n5("We managed to miss sentinel node (input)");
                     break;
                  }
               }
            }
         }
      }

      return this;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new x9(this);
   }

   @Override
   public int c8() {
      return super.c8() | 8;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
