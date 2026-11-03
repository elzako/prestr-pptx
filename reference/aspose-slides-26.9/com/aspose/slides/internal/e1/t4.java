package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List;

public class t4 {
   private float[] n5;
   private float[] l6;
   private float[] k5;
   private t4$l6[] u3;
   private byte[] a6;

   public t4() {
   }

   private t4(t4$n5 var1) {
      this.n5 = this.n5(var1.l6());
      this.l6 = this.n5(var1.k5());
      this.k5 = this.n5(var1.u3());
      this.u3 = (t4$l6[])var1.n5().toArray(new t4$l6[0]);
      this.a6 = this.l6(var1.a6());
   }

   private float[] n5(List<Float> var1) {
      int var2 = var1.size();
      float[] var3 = new float[var2];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1.toArray(new Float[var2]))), com.aspose.slides.ms.System.u3.n5((Object)(var3)), var2);
      return var3;
   }

   private byte[] l6(List<Byte> var1) {
      int var2 = var1.size();
      byte[] var3 = new byte[var2];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1.toArray(new Byte[var2]))), com.aspose.slides.ms.System.u3.n5((Object)(var3)), var2);
      return var3;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/e1/t4$n5;Lcom/aspose/slides/internal/e1/t4$1;)V -> (Lcom/aspose/slides/internal/e1/t4$n5;)V
   t4(com.aspose.slides.internal.e1.t4$n5 recoveredArg0, com.aspose.slides.internal.e1.t4$1 recoveredArg1) {
      this(recoveredArg0);
   }
}
