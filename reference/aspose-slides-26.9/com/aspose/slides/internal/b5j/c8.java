package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class c8 {
   public int n5 = 19;
   public List<Float> l6 = new List<>();
   public Dictionary<Integer, Float> k5 = new Dictionary<>();

   public c8(int var1, float... var2) {
      this.n5 = var1;
      this.l6 = new List<>(com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5(var2)));
   }

   public final boolean n5() {
      switch (this.n5) {
         case 0:
         case 3:
         case 5:
         case 7:
         case 9:
         case 11:
         case 13:
         case 15:
         case 17:
            return true;
         case 1:
         case 2:
         case 4:
         case 6:
         case 8:
         case 10:
         case 12:
         case 14:
         case 16:
         default:
            return false;
      }
   }
}
