package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.j8;
import java.awt.Color;

@j3
public class c8 extends com.aspose.slides.internal.v6g.h0<c8> {
   private long u9;
   short n5;
   short l6;
   String k5;
   public static c8 u3 = new c8();
   // $VF: synthetic field
   static final boolean a6 = !c8.class.desiredAssertionStatus();

   public Color n5() {
      return new Color(this.x8() & 255, this.n3() & 255, this.y4() & 255, this.s7() & 255);
   }

   static c8 n5(int var0, int var1, int var2, int var3, String var4, int var5) {
      c8 var6 = n5(var0, var1, var2, var3).o8();
      var6.n5 = 5;
      var6.k5 = m1.l6(var5);
      var6.l6 = (short)var5;
      return var6;
   }

   static c8 l6(int var0, int var1, int var2, int var3, String var4, int var5) {
      c8 var6 = n5(var0, var1, var2, var3, var4, var5).o8();
      var6.n5 = (short)(var6.n5 | 8);
      return var6;
   }

   public String l6() {
      if (this.k5 == null) {
         if (this.a6()) {
            this.k5 = m1.n5(this.l6);
         } else {
            this.k5 = d1.n5("{0:x}", new Object[]{this.h0()});
         }
      }

      return this.k5;
   }

   public boolean k5() {
      return (this.n5 & 1) != 0;
   }

   public boolean u3() {
      return (this.n5 & 8) != 0;
   }

   public boolean a6() {
      return (this.n5 & 5) != 0;
   }

   long u9() {
      if (this.u9 == 0L && this.k5()) {
         this.u9 = m1.n5((int)this.l6).h0() & 4294967295L;
      }

      return this.u9;
   }

   void n5(long var1) {
      this.u9 = var1;
   }

   public static c8 n5(int var0, int var1, int var2) {
      return n5(255, var0, var1, var2);
   }

   public static c8 n5(int var0, int var1, int var2, int var3) {
      l6(var0, var1, var2, var3);
      c8 var4 = new c8();
      var4.n5 = 2;
      var4.n5((long)((var0 << 24) + (var1 << 16) + (var2 << 8) + var3));
      return var4;
   }

   public int h0() {
      return (int)this.u9();
   }

   public static c8 n5(int var0, c8 var1) {
      return n5(var0, var1.x8() & 255, var1.n3() & 255, var1.y4() & 255);
   }

   public static c8 n5(int var0) {
      return n5(var0 >>> 24 & 0xFF, var0 >>> 16 & 0xFF, var0 >>> 8 & 0xFF, var0 & 0xFF);
   }

   public static c8 n5(String var0) {
      try {
         int var1 = (int)com.aspose.slides.ms.System.d5.parse(q0.class, var0, true);
         return m1.n5(var1);
      } catch (Exception var3) {
         c8 var2 = n5(0, 0, 0, 0).o8();
         var2.k5 = var0;
         var2.n5 = (short)(var2.n5 | 4);
         return var2;
      }
   }

   public static boolean n5(c8 var0, c8 var1) {
      if (var0.u9() != var1.u9()) {
         return false;
      } else if (var0.a6() != var1.a6()) {
         return false;
      } else if (var0.u3() != var1.u3()) {
         return false;
      } else {
         return var0.t2() != var1.t2() ? false : !var0.a6() || d1.a6(var0.l6(), var1.l6());
      }
   }

   public static boolean l6(c8 var0, c8 var1) {
      return !k5(var0, var1);
   }

   public float c8() {
      byte var1 = (byte)Math.min(this.x8() & 255, Math.min(this.n3() & 255, this.y4() & 255));
      byte var2 = (byte)Math.max(this.x8() & 255, Math.max(this.n3() & 255, this.y4() & 255));
      return ((var2 & 255) + (var1 & 255)) / 510.0F;
   }

   public boolean t2() {
      return this.n5 == 0;
   }

   public byte s7() {
      return (byte)(this.u9() >> 24 & 255L);
   }

   public byte x8() {
      return (byte)(this.u9() >> 16 & 255L);
   }

   public byte n3() {
      return (byte)(this.u9() >> 8 & 255L);
   }

   public byte y4() {
      return (byte)(this.u9() & 255L);
   }

   @Override
   public int hashCode() {
      int var1 = (int)(this.u9() ^ this.u9() >> 32 ^ this.n5 ^ this.l6 >> 16);
      if (this.a6()) {
         var1 ^= this.l6().hashCode();
      }

      return var1;
   }

   @Override
   public String toString() {
      if (this.t2()) {
         return "Color [Empty]";
      } else {
         return this.a6()
            ? "Color [" + this.l6() + "]"
            : d1.n5("Color [A={0}, R={1}, G={2}, B={3}]",new Object[]{ this.s7() & 255, this.x8() & 255, this.n3() & 255, this.y4() & 255});
      }
   }

   private static void l6(int var0, int var1, int var2) {
      if (var0 > 255 || var0 < 0) {
         throw n5(var0, "red");
      } else if (var1 > 255 || var1 < 0) {
         throw n5(var1, "green");
      } else if (var2 > 255 || var2 < 0) {
         throw n5(var2, "blue");
      }
   }

   private static ArgumentException n5(int var0, String var1) {
      return new ArgumentException(
         d1.n5("'{0}' is not a valid value for '{1}'. '{1}' should be greater or equal to 0 and less than or equal to 255.",new Object[]{ var0, var1})
      );
   }

   private static void l6(int var0, int var1, int var2, int var3) {
      if (var0 <= 255 && var0 >= 0) {
         l6(var1, var2, var3);
      } else {
         throw n5(var0, "alpha");
      }
   }

   public static c8 e2() {
      return m1.n5(27);
   }

   public static c8 t9() {
      return m1.n5(28);
   }

   public static c8 z1() {
      return m1.n5(29);
   }

   public static c8 t4() {
      return m1.n5(30);
   }

   public static c8 q0() {
      return m1.n5(31);
   }

   public static c8 z3() {
      return m1.n5(32);
   }

   public static c8 m1() {
      return m1.n5(33);
   }

   public static c8 k7() {
      return m1.n5(34);
   }

   public static c8 m3() {
      return m1.n5(35);
   }

   public static c8 z8() {
      return m1.n5(36);
   }

   public static c8 j5() {
      return m1.n5(37);
   }

   public static c8 w1() {
      return m1.n5(38);
   }

   public static c8 r4() {
      return m1.n5(39);
   }

   public static c8 c4() {
      return m1.n5(40);
   }

   public static c8 y2() {
      return m1.n5(41);
   }

   public static c8 y1() {
      return m1.n5(42);
   }

   public static c8 a0() {
      return m1.n5(43);
   }

   public static c8 d2() {
      return m1.n5(44);
   }

   public static c8 d5() {
      return m1.n5(45);
   }

   public static c8 s3() {
      return m1.n5(46);
   }

   public static c8 p8() {
      return m1.n5(47);
   }

   public static c8 f2() {
      return m1.n5(48);
   }

   public static c8 i1() {
      return m1.n5(49);
   }

   public static c8 e5() {
      return m1.n5(50);
   }

   public static c8 b3() {
      return m1.n5(51);
   }

   public static c8 o0() {
      return m1.n5(52);
   }

   public static c8 z7() {
      return m1.n5(53);
   }

   public static c8 v4() {
      return m1.n5(54);
   }

   public static c8 u6() {
      return m1.n5(55);
   }

   public static c8 t1() {
      return m1.n5(56);
   }

   public static c8 a5() {
      return m1.n5(57);
   }

   public static c8 h2() {
      return m1.n5(58);
   }

   public static c8 v0() {
      return m1.n5(59);
   }

   public static c8 f0() {
      return m1.n5(60);
   }

   public static c8 a3() {
      return m1.n5(61);
   }

   public static c8 p3() {
      return m1.n5(62);
   }

   public static c8 x9() {
      return m1.n5(63);
   }

   public static c8 y0() {
      return m1.n5(64);
   }

   public static c8 j9() {
      return m1.n5(65);
   }

   public static c8 z6() {
      return m1.n5(66);
   }

   public static c8 e9() {
      return m1.n5(67);
   }

   public static c8 o5() {
      return m1.n5(68);
   }

   public static c8 j8() {
      return m1.n5(69);
   }

   public static c8 w2() {
      return m1.n5(70);
   }

   public static c8 s0() {
      return m1.n5(71);
   }

   public static c8 v8() {
      return m1.n5(72);
   }

   public static c8 v3() {
      return m1.n5(73);
   }

   public static c8 g7() {
      return m1.n5(74);
   }

   public static c8 j4() {
      return m1.n5(75);
   }

   public static c8 i9() {
      return m1.n5(76);
   }

   public static c8 f5() {
      return m1.n5(77);
   }

   public static c8 j3() {
      return m1.n5(78);
   }

   public static c8 n1() {
      return m1.n5(79);
   }

   public static c8 p6() {
      return m1.n5(80);
   }

   public static c8 d1() {
      return m1.n5(81);
   }

   public static c8 s4() {
      return m1.n5(82);
   }

   public static c8 h6() {
      return m1.n5(83);
   }

   public static c8 y8() {
      return m1.n5(84);
   }

   public static c8 c3() {
      return m1.n5(85);
   }

   public static c8 l4() {
      return m1.n5(86);
   }

   public static c8 i6() {
      return m1.n5(87);
   }

   public static c8 a7() {
      return m1.n5(88);
   }

   public static c8 r8() {
      return m1.n5(89);
   }

   public static c8 r1() {
      return m1.n5(90);
   }

   public static c8 y5() {
      return m1.n5(91);
   }

   public static c8 k8() {
      return m1.n5(92);
   }

   public static c8 b5() {
      return m1.n5(93);
   }

   public static c8 u8() {
      return m1.n5(94);
   }

   public static c8 w5() {
      return m1.n5(96);
   }

   public static c8 q1() {
      return m1.n5(95);
   }

   public static c8 u5() {
      return m1.n5(97);
   }

   public static c8 w8() {
      return m1.n5(98);
   }

   public static c8 c2() {
      return m1.n5(99);
   }

   public static c8 t3() {
      return m1.n5(100);
   }

   public static c8 u4() {
      return m1.n5(101);
   }

   public static c8 s9() {
      return m1.n5(102);
   }

   public static c8 p7() {
      return m1.n5(103);
   }

   public static c8 z5() {
      return m1.n5(104);
   }

   public static c8 h5() {
      return m1.n5(105);
   }

   public static c8 a8() {
      return m1.n5(106);
   }

   public static c8 f4() {
      return m1.n5(107);
   }

   public static c8 y9() {
      return m1.n5(108);
   }

   public static c8 a1() {
      return m1.n5(109);
   }

   public static c8 w3() {
      return m1.n5(110);
   }

   public static c8 i4() {
      return m1.n5(111);
   }

   public static c8 q3() {
      return m1.n5(112);
   }

   public static c8 q2() {
      return m1.n5(113);
   }

   public static c8 p4() {
      return m1.n5(114);
   }

   public static c8 d6() {
      return m1.n5(115);
   }

   public static c8 y6() {
      return m1.n5(116);
   }

   public static c8 n7() {
      return m1.n5(117);
   }

   public static c8 l5() {
      return m1.n5(118);
   }

   public static c8 u2() {
      return m1.n5(119);
   }

   public static c8 d9() {
      return m1.n5(120);
   }

   public static c8 c5() {
      return m1.n5(121);
   }

   public static c8 t5() {
      return m1.n5(122);
   }

   public static c8 j6() {
      return m1.n5(123);
   }

   public static c8 w9() {
      return m1.n5(124);
   }

   public static c8 m8() {
      return m1.n5(125);
   }

   public static c8 b9() {
      return m1.n5(126);
   }

   public static c8 r6() {
      return m1.n5(127);
   }

   public static c8 r5() {
      return m1.n5(128);
   }

   public static c8 h9() {
      return m1.n5(129);
   }

   public static c8 r7() {
      return m1.n5(130);
   }

   public static c8 n9() {
      return m1.n5(131);
   }

   public static c8 a2() {
      return m1.n5(132);
   }

   public static c8 h1() {
      return m1.n5(133);
   }

   public static c8 t6() {
      return m1.n5(134);
   }

   public static c8 v6() {
      return m1.n5(135);
   }

   public static c8 x0() {
      return m1.n5(136);
   }

   public static c8 o2() {
      return m1.n5(137);
   }

   public static c8 e0() {
      return m1.n5(138);
   }

   public static c8 i2() {
      return m1.n5(139);
   }

   public static c8 x7() {
      return m1.n5(140);
   }

   public static c8 z0() {
      return m1.n5(141);
   }

   public static c8 z9() {
      return m1.n5(142);
   }

   public static c8 f8() {
      return m1.n5(143);
   }

   public static c8 s2() {
      return m1.n5(144);
   }

   public static c8 n2() {
      return m1.n5(145);
   }

   public static c8 l0() {
      return m1.n5(146);
   }

   public static c8 p9() {
      return m1.n5(147);
   }

   public static c8 g8() {
      return m1.n5(148);
   }

   public static c8 i0() {
      return m1.n5(149);
   }

   public static c8 b4() {
      return m1.n5(150);
   }

   public static c8 x5() {
      return m1.n5(151);
   }

   public static c8 i8() {
      return m1.n5(152);
   }

   public static c8 a4() {
      return m1.n5(153);
   }

   public static c8 x3() {
      return m1.n5(154);
   }

   public static c8 b2() {
      return m1.n5(155);
   }

   public static c8 m4() {
      return m1.n5(156);
   }

   public static c8 b1() {
      return m1.n5(157);
   }

   public static c8 j1() {
      return m1.n5(158);
   }

   public static c8 k6() {
      return m1.n5(159);
   }

   public static c8 o7() {
      return m1.n5(160);
   }

   public static c8 v9() {
      return m1.n5(161);
   }

   public static c8 r9() {
      return m1.n5(162);
   }

   public static c8 c7() {
      return m1.n5(163);
   }

   public static c8 w4() {
      return m1.n5(164);
   }

   public static c8 n0() {
      return m1.n5(165);
   }

   public static c8 f1() {
      return m1.n5(166);
   }

   public static c8 k2() {
      return m1.n5(167);
   }

   public void n5(c8 var1) {
      var1.u9 = this.u9;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public c8 o8() {
      c8 var1 = new c8();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.o8();
   }

   private boolean k5(c8 var1) {
      return var1.u9 == this.u9 && var1.n5 == this.n5 && var1.l6 == this.l6 && j8.n5(var1.k5, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof c8) ? false : this.k5((c8)obj);
      }
   }

   public static boolean k5(c8 var0, c8 var1) {
      return var0.equals(var1);
   }

   public static Color l6(c8 var0) {
      return var0 == null ? null : var0.n5();
   }

   public static c8 n5(Color var0) {
      if (var0 == null) {
         return new c8();
      }

      c8 var1 = new c8();
      var1.n5((long)var0.getRGB());
      var1.n5 = l6(var0);
      return var1;
   }

   private static short l6(Color var0) {
      byte var1 = 0;
      if (var0.getRGB() == 0) {
         var1 = 0;
      } else {
         var1 = 2;
      }

      return var1;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public c8 Clone() {
      return this.o8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(c8 bridgeArg0) {
      this.n5(bridgeArg0);
   }


   static {
      com.aspose.slides.internal.v6g.k5.n5(c8.class, new t2());
   }
}
