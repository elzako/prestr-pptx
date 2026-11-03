package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class l9 {
   public long n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public k5w[] u9;

   public l9(byte[] var1) {
      t4 var2 = new t4(var1);
      this.n5 = var2.u3();
      this.l6 = var2.u9();
      this.k5 = var2.u9();
      this.u3 = var2.u9();
      this.a6 = var2.u9();
      List var3 = new List(this.l6 & 65535);

      for (int var4 = 0; var4 < (this.l6 & 65535); var4++) {
         k5w var5 = new k5w();
         var5.n5 = k4o.n5(var2.u3());
         var5.l6 = var2.u3();
         var5.k5 = var2.u3();
         var5.u3 = var2.u3();
         if (!"DSIG".equals(var5.n5)) {
            var3.addItem(var5);
         }
      }

      this.l6 = var3.size() & 65535;
      this.u9 = (k5w[])var3.toArray(new k5w[0]);
   }
}
