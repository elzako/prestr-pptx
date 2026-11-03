package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import java.util.TimeZone;

@j3
public class w1 extends com.aspose.slides.internal.v6g.h0<w1> implements Comparable<w1> {
   public static w1 n5 = new w1(j5.k5.m3(), s4.k5.n3());
   public static w1 l6 = new w1(j5.l6.m3(), s4.k5.n3());
   private j5 u3 = new j5();
   private s4 a6 = new s4();
   // $VF: synthetic field
   static final boolean k5 = !w1.class.desiredAssertionStatus();

   public w1() {
   }

   public w1(j5 var1) {
      var1.u3(this.u3);
      if (var1.a6() == 1L) {
         s4.k5.u3(this.a6);
      } else {
         h6.n5(TimeZone.getDefault(), var1.m3()).u3(this.a6);
      }

      if (j5.k5(this.u3(), j5.l6) || j5.n5(this.u3(), j5.k5)) {
         throw new ArgumentOutOfRangeException("The UTC date and time that results from applying the offset is earlier than MinValue or later than MaxValue.");
      }
   }

   public w1(j5 var1, s4 var2) {
      if (var1.a6() == 1L && !s4.l6(var2, s4.k5)) {
         throw new ArgumentException("dateTime.Kind equals Utc and offset does not equal zero.");
      }

      if (var1.a6() == 2L && !s4.l6(var2, h6.n5(TimeZone.getDefault(), var1.m3()))) {
         throw new ArgumentException("dateTime.Kind equals Local and offset does not equal the offset of the system's local time zone.");
      }

      if (var2.a6() % 600000000L != 0L) {
         throw new ArgumentException("offset is not specified in whole minutes.");
      }

      if (!s4.u9(var2, new s4(-14, 0, 0)) && !s4.u3(var2, new s4(14, 0, 0))) {
         var1.u3(this.u3);
         var2.u3(this.a6);
         if (j5.k5(this.u3(), j5.l6) || j5.n5(this.u3(), j5.k5)) {
            throw new ArgumentOutOfRangeException("The UtcDateTime property is earlier than MinValue or later than MaxValue.");
         }
      } else {
         throw new ArgumentOutOfRangeException("offset is less than -14 hours or greater than 14 hours.");
      }
   }

   public w1(long var1, s4 var3) {
      this(new j5(var1), var3.n3());
   }

   public int n5(w1 var1) {
      return this.u3().n5(var1.u3().m3());
   }

   @Override
   public int hashCode() {
      return this.u3.hashCode() ^ this.a6.hashCode();
   }

   public static w1 n5(j5 var0) {
      return new w1(var0.m3());
   }

   @Override
   public String toString() {
      return this.n5(null, null);
   }

   public String n5(String var1, h2 var2) {
      com.aspose.slides.internal.x7n.u3 var3 = com.aspose.slides.internal.x7n.u3.n5(var2);
      boolean var4 = var2 == null;
      if (var1 == null || d1.a6(var1, "")) {
         var4 = false;
         var1 = d1.n5(new String[]{var3.q0(), " ", var3.m1()});
         if (var1.indexOf("zzz") < 0) {
            if (var1.indexOf("zz") > 0) {
               var1 = var1.replace("zz", "zzz");
            } else if (var1.indexOf("z") > 0) {
               var1 = var1.replace("z", "zzz");
            } else {
               var1 = var1 + " zzz";
            }
         }
      }

      boolean var5 = false;
      boolean var6 = false;
      if (var1.length() == 1) {
         var4 = false;
         char var7 = var1.charAt(0);

         try {
            boolean[] var8 = new boolean[]{false};
            boolean[] var9 = new boolean[]{false};
            var1 = r4.l6(var7, var3, var8, var9, true);
            var5 = var8[0];
            var6 = var9[0];
         } catch (Exception var10) {
            var1 = null;
         }

         if (var1 == null) {
            throw new FormatException("format is not one of the format specifier characters defined for DateTimeFormatInfo");
         }
      }

      return var5 ? r4.n5(this.u3().m3(), s4.k5.n3(), var1, var3, var4) : r4.n5(this.n5().m3(), this.k5().n3(), var1, var3, var4);
   }

   public j5 n5() {
      return j5.n5(this.u3.m3(), 0L);
   }

   public j5 l6() {
      return this.u3().q0();
   }

   public s4 k5() {
      return this.a6;
   }

   public j5 u3() {
      return j5.n5(j5.l6(this.u3, this.a6).m3(), 1L);
   }

   public void l6(w1 var1) {
      this.u3.u3(var1.u3);
      this.a6.u3(var1.a6);
   }

   public w1 a6() {
      w1 var1 = new w1();
      this.l6(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.a6();
   }

   private boolean k5(w1 var1) {
      return j8.n5(var1.u3, this.u3) && j8.n5(var1.a6, this.a6);
   }

   @Override
   public boolean equals(Object obj) {
      assert obj != null;
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof w1) ? false : this.k5((w1)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public w1 Clone() {
      return this.a6();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(w1 bridgeArg0) {
      this.l6(bridgeArg0);
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public int compareTo(w1 bridgeArg0) {
      return this.n5(bridgeArg0);
   }

}
