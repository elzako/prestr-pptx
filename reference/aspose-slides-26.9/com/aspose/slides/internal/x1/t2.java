package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;

public class t2 extends c8 {
   private final List<c8> x8 = new List<>();

   public t2() {
      this.l6 = com.aspose.slides.internal.v6g.k5.l6((byte)1, 6);
   }

   public t2(String var1) {
      this.l6 = com.aspose.slides.internal.v6g.k5.l6((byte)1, 6);
      this.n5(var1);
   }

   public boolean a6(c8 var1) {
      this.x8.addItem(var1);
      return true;
   }

   public boolean l6(String var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < this.x8.size(); var2++) {
            c8 var3 = this.x8.get_Item(var2);
            if (d1.a6(var3.x8(), var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public boolean u9(c8 var1) {
      this.x8.removeItem(var1);
      return true;
   }

   public boolean k5(String var1) {
      this.x8.removeItem(this.u3(var1));
      return true;
   }

   public c8 u3(String var1) {
      if (var1 != null) {
         for (int var2 = 0; var2 < this.x8.size(); var2++) {
            c8 var3 = this.x8.get_Item(var2);
            if (d1.a6(var3.x8(), var1)) {
               return var3;
            }
         }
      }

      return null;
   }

   public List<c8> n5() {
      return this.x8;
   }
}
