package com.aspose.slides.internal.i4;

public class f2 extends u6 {
   private j9 u3;

   public final g7 n5(y1 var1, g7[] var2) {
      return this.u3.c4().u9(com.aspose.slides.ms.System.d1.n5(new String[]{var1.n5("name").toString(), ": ", var1.n5("message").toString()}));
   }

   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      g7 var4;
      if ("toString".equals(this.n5)) {
         var4 = this.n5(var2, var3);
      } else {
         if (!"toLocaleString".equals(this.n5)) {
            throw new j3("unknown error function");
         }

         var4 = this.n5(var2, var3);
      }

      var1.l6(var4);
      return var4;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("function {0}", new Object[]{this.n3()});
   }

   public f2(j9 var1, String var2, j4 var3) {
      super(var3);
      this.n5 = var2;
      this.u3 = var1;
   }
}
