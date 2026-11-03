package com.aspose.slides.internal.y9w;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;

public class t2 {
   private final List<Long> n5 = new List<>();

   public t2() {
   }

   public t2(t4 var1) {
      var1.setPosition(0L);
      this.n5(var1, (int)var1.getLength() / 4);
   }

   public final void n5(t4 var1, int var2) {
      com.aspose.slides.internal.z0k.n5 var3 = new com.aspose.slides.internal.z0k.n5(var1, j5.z1());

      for (int var4 = 0; var4 < var2; var4++) {
         this.n5.addItem(var3.c4());
      }
   }

   public final e2 k5() {
      e2 var1 = new e2();
      com.aspose.slides.internal.z0k.l6 var2 = new com.aspose.slides.internal.z0k.l6(var1, j5.z1());

      for (long var3 = 0L; (var3 & 4294967295L) < this.n5.size(); var3++) {
         var2.n5(this.l6(var3) & 4294967295L);
      }

      return var1;
   }

   public final void n5(long var1) {
      this.n5.addItem(var1);
   }

   public final long l6(long var1) {
      return this.n5.get_Item((int)var1) & 4294967295L;
   }

   public final int u3() {
      return this.n5.size();
   }
}
