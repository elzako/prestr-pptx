package com.aspose.slides;

class y4x implements IGenericCloneable<y4x>, Cloneable {
   public boolean n5;
   public boolean l6 = false;
   public float k5 = 3000000.0F;
   public IWarningCallback u3;
   public byte a6 = 85;
   public float u9 = 96.0F;
   public boolean h0 = false;
   public boolean c8 = false;
   public int t2 = 72;
   public boolean s7 = true;
   public boolean x8 = true;
   public boolean n3 = true;
   public IPdfOptions y4 = null;
   public InkOptions e2 = new InkOptions();
   public float t9 = 4.0F;
   public int z1 = 0;
   public boolean t4;

   public final boolean n5() {
      return this.y4 != null;
   }

   public final y4x l6() {
      return (y4x)this.k5();
   }

   public static int n5(com.aspose.slides.internal.o9b.p8 var0) {
      float var1 = com.aspose.slides.ms.System.q1.n5((float)(var0.l6() / 10.0F), (float)(var0.k5() / 10.0F));
      return com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.n5((float)(var1), (float)(96.0F)), 13);
   }

   protected Object k5() {
      try {
         return (y4x)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public y4x cloneT() {
      return this.l6();
   }

}
