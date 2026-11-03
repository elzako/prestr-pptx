package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class x9 extends a5 {
   public static final x9 n5 = new x9(d1.n5);
   private final String l6;

   private x9(String var1) {
      this.l6 = var1;
   }

   public static x9 l6(String var0) {
      return d1.n5(var0) ? n5 : new x9(var0);
   }

   @Override
   public Object g_() {
      return this.l6;
   }

   @Override
   public String j_() {
      return this.l6;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) {
         return true;
      }

      x9 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, x9.class);
      return var2 == null ? false : d1.a6(var2.l6, this.l6) || d1.a6(var2.l6, this.l6);
   }

   @Override
   public int hashCode() {
      return this.l6.hashCode();
   }

   // Restored original synthetic constructor delegation: (Ljava/lang/String;Lcom/aspose/slides/internal/h2/x9$1;)V -> (Ljava/lang/String;)V
   x9(java.lang.String recoveredArg0, com.aspose.slides.internal.h2.x9$1 recoveredArg1) {
      this(recoveredArg0);
   }
}
