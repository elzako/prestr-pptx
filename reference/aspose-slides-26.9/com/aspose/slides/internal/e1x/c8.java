package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class c8 {
   private com.aspose.slides.internal.n2d.k5 n5;
   private long l6;
   private long k5;
   private Dictionary<Long, List<Long>> u3;

   public final Dictionary<Long, List<Long>> n5() {
      return this.u3;
   }

   public c8(com.aspose.slides.internal.n2d.k5 var1, long var2) {
      this.n5 = var1;
      this.l6 = this.n5.n5().getPosition();
      this.k5 = var2;
      this.u3 = new Dictionary<>();
   }

   public final void l6() {
      this.n5.n5().setPosition(this.k5);
      this.u3.addItem(0L, new List<>());
      int var1 = this.n5.a6();
      if ((var1 & 65535) == 1) {
         long var2 = this.n5.a6() & 65535;
         long var4 = this.n5.a6() & 65535;

         for (long var6 = 0L; (var6 & 4294967295L) < (var4 & 4294967295L); var6++) {
            long var8 = this.n5.a6() & 65535;
            if (this.u3.containsKey(var8)) {
               this.u3.get_Item(var8).addItem((var2 & 4294967295L) + (var6 & 4294967295L) & 4294967295L);
            } else {
               List var10 = new List();
               var10.addItem((var2 & 4294967295L) + (var6 & 4294967295L) & 4294967295L);
               this.u3.addItem(var8, var10);
            }
         }
      } else {
         long var21 = this.n5.a6() & 65535;

         for (int var11 = 0; var11 < (var21 & 4294967295L); var11++) {
            long var12 = this.n5.a6() & 65535;
            long var14 = this.n5.a6() & 65535;
            long var16 = this.n5.a6() & 65535;

            for (long var18 = 0L; (var18 & 4294967295L) < (((var14 & 4294967295L) - (var12 & 4294967295L) & 4294967295L) + 1L & 4294967295L); var18++) {
               if (this.u3.containsKey(var16)) {
                  this.u3.get_Item(var16).addItem((var12 & 4294967295L) + (var18 & 4294967295L) & 4294967295L);
               } else {
                  List var20 = new List();
                  var20.addItem((var12 & 4294967295L) + (var18 & 4294967295L) & 4294967295L);
                  this.u3.addItem(var16, var20);
               }
            }
         }
      }

      this.n5.n5().setPosition(this.l6);
   }
}
