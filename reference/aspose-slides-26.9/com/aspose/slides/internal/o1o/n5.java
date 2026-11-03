package com.aspose.slides.internal.o1o;

import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import java.util.ArrayList;

public class n5 extends l6 {
   private final ArrayList<y1> l6 = new ArrayList<>();

   @Override
   protected void n5(com.aspose.slides.internal.w4c.l6 var1, w1 var2, w1 var3, w1 var4) {
      y1 var5 = u9.l6(var2, var3, var4);
      var5.n5(1.0F, 1.0F);
      this.l6.add(var5);
   }

   @Override
   public com.aspose.slides.internal.w4c.l6 n5(float var1, float var2) {
      for (int var3 = this.n5.size() - 1; var3 >= 0; var3--) {
         y1 var4 = this.l6.get(var3);
         if (var4.l6(var1, var2)) {
            com.aspose.slides.internal.w4c.l6 var5 = this.n5.get(var3);
            if (var5.n5(var1, var2)) {
               return var5;
            }
         }
      }

      for (int var6 = this.n5.size() - 1; var6 >= 0; var6--) {
         y1 var7 = this.l6.get(var6);
         if (var7.l6(var1, var2)) {
            com.aspose.slides.internal.w4c.l6 var8 = this.n5.get(var6);
            if (var8.l6(var1, var2)) {
               return var8;
            }
         }
      }

      return null;
   }
}
