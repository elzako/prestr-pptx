package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class i4w {
   private y1 n5;
   private long l6;

   public i4w(String var1, String var2, String var3, Dictionary<String, Integer> var4, List<r8e> var5) {
      this.n5 = new y1(var1, var2, var4, var5);
      this.l6 = u3k.n5(var3, var4, var5);
   }

   public i4w(long var1, long var3, long var5) {
      this.n5 = new y1(var1, var3);
      this.l6 = var5;
   }

   public y1 n5() {
      return this.n5;
   }

   public long l6() {
      return this.l6;
   }

   public void n5(long var1) {
      this.l6 = var1;
   }
}
