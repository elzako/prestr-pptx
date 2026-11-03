package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class j3 extends com.aspose.slides.internal.x6s.h0 {
   public com.aspose.slides.internal.x6s.a6 n5;
   public int l6;
   public String u3;
   public String a6;
   public int u9;
   public boolean h0;
   public boolean c8 = true;

   public j3(com.aspose.slides.internal.x6s.a6 var1, boolean var2) {
      this.n5 = var1;
      this.h0 = var2;
   }

   public j3(com.aspose.slides.internal.x6s.a6 var1, int var2, boolean var3) {
      this(var1, var3);
      this.l6 = var2;
   }

   public j3(com.aspose.slides.internal.x6s.a6 var1, String var2, String var3, boolean var4) {
      this(var1, var4);
      if (var2 == null) {
         throw new ArgumentNullException("name");
      }

      if (var3 == null) {
         throw new ArgumentNullException("namespaceURI");
      }

      this.u3 = var2;
      this.a6 = var3;
   }

   public j3(j3 var1) {
      this.n5 = var1.n5.n5();
      this.l6 = var1.l6;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 k5() {
      return this.n5;
   }

   @Override
   public int u3() {
      return this.u9;
   }

   protected boolean u9() {
      return this.u3 == null
         ? this.l6 == this.n5.k5() || this.l6 == 9 || this.l6 == 4 && (this.n5.k5() == 6 || this.n5.k5() == 5)
         : this.n5.k5() == 1
            && (this.u3.length() == 0 || com.aspose.slides.ms.System.d1.a6(this.u3, this.n5.u3()))
            && com.aspose.slides.ms.System.d1.a6(this.a6, this.n5.a6());
   }
}
