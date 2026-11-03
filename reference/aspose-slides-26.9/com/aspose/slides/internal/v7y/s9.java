package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.XPathException;

public abstract class s9 extends k8 {
   protected boolean a6;
   protected boolean u9;

   public s9(j9 var1, String var2, String var3, int var4, boolean var5, boolean var6) {
      super(var1, var2, var3, var4);
      this.a6 = var5;
      this.u9 = var6;
   }

   public s9(s9 var1) {
      super(var1);
      this.a6 = var1.a6;
      this.u9 = var1.u9;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (var1 != null) {
         if (!this.u9) {
            throw XPathException.create("'{0}' is an invalid XSLT pattern.");
         }

         com.aspose.slides.internal.x6s.a6 var2 = null;
         if (this.l6(var1)) {
            if (this.a6 && (var2 = this.n5.n5(var1)) != null) {
               return var2;
            }

            com.aspose.slides.internal.x6s.a6 var3 = var1.n5();

            while (var3.q0()) {
               if ((var2 = this.n5.n5(var3)) != null) {
                  return var2;
               }
            }
         }
      }

      return null;
   }
}
