package com.aspose.slides.internal.s7k;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j8;

public class x8 extends com.aspose.slides.internal.v6g.h0<x8> {
   public long n5;
   public long l6;
   public long k5;
   public int u3;
   public int a6;
   public int u9;
   public k5 h0 = new k5();
   public long c8;
   public long t2;
   public long s7;
   public long x8;
   public long n3;
   public long y4;
   public int e2;
   public b3 t9 = new b3();
   public long z1;
   public byte[] t4;
   public byte[] q0;

   @Override
   public String toString() {
      a5 var1 = new a5();
      var1.n5("[Size={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.n5)});
      var1.n5(" CmmId={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.l6)});
      byte[] var2 = com.aspose.slides.ms.System.x8.n5(this.k5);
      var1.n5(
         " Version={0:x}.{1:x}.{2:x}.{3:x};",new Object[]{
         com.aspose.slides.internal.v6g.k5.n5(var2[3]),
         com.aspose.slides.internal.v6g.k5.n5(var2[2]),
         com.aspose.slides.internal.v6g.k5.n5(var2[1]),
         com.aspose.slides.internal.v6g.k5.n5(var2[0])
      });
      var1.n5(" DeviceClass={0};",new Object[]{ d2.a6(this.u3)});
      var1.n5(" ColorSpace={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.l6(this.a6)});
      var1.n5(" Pcs={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.l6(this.u9)});
      var1.n5(" Date={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.h0)});
      var2 = com.aspose.slides.ms.System.x8.n5(this.c8);
      var1.n5(
         " Magic={0}{1}{2}{3};",new Object[]{
         com.aspose.slides.internal.v6g.k5.n5((char)var2[3]),
         com.aspose.slides.internal.v6g.k5.n5((char)var2[2]),
         com.aspose.slides.internal.v6g.k5.n5((char)var2[1]),
         com.aspose.slides.internal.v6g.k5.n5((char)var2[0])
      });
      var1.n5(" Platform={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.t2)});
      var1.n5(" Flags={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.s7)});
      var1.n5(" Manufacturer={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.x8)});
      var1.n5(" Model={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.n3)});
      var1.n5(" Attributes={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.y4)});
      var1.n5(" RenderingIntent={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.l6(this.e2)});
      var1.n5(" Illuminant={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.t9)});
      var1.n5(" Creator={0};",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.z1)});
      a5 var3 = new a5();

      for (byte var7 : this.t4) {
         var3.n5("{0:x}",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(var7)});
      }

      var1.n5(" ProfileID={0};",new Object[]{ var3});
      var1.n5(" Reserved={0}]",new Object[]{ com.aspose.slides.internal.v6g.k5.n5(this.q0[0])});
      return var1.toString();
   }

   public void n5(x8 var1) {
      var1 = var1 == null ? new x8() : var1;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      var1.u3 = this.u3;
      var1.a6 = this.a6;
      var1.u9 = this.u9;
      this.h0.n5(var1.h0);
      var1.c8 = this.c8;
      var1.t2 = this.t2;
      var1.s7 = this.s7;
      var1.x8 = this.x8;
      var1.n3 = this.n3;
      var1.y4 = this.y4;
      var1.e2 = this.e2;
      this.t9.n5(var1.t9);
      var1.z1 = this.z1;
      var1.t4 = this.t4;
      var1.q0 = this.q0;
   }

   public x8 n5() {
      x8 var1 = new x8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.n5();
   }

   private boolean l6(x8 var1) {
      return var1.n5 == this.n5
         && var1.l6 == this.l6
         && var1.k5 == this.k5
         && var1.u3 == this.u3
         && var1.a6 == this.a6
         && var1.u9 == this.u9
         && j8.n5(var1.h0, this.h0)
         && var1.c8 == this.c8
         && var1.t2 == this.t2
         && var1.s7 == this.s7
         && var1.x8 == this.x8
         && var1.n3 == this.n3
         && var1.y4 == this.y4
         && var1.e2 == this.e2
         && j8.n5(var1.t9, this.t9)
         && var1.z1 == this.z1
         && j8.n5(var1.t4, this.t4)
         && j8.n5(var1.q0, this.q0);
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof x8) ? false : this.l6((x8)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public x8 Clone() {
      return this.n5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(x8 bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
