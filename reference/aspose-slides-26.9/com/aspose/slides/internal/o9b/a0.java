package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.f4l.a3;
import com.aspose.slides.internal.f4l.g7;
import com.aspose.slides.internal.f4l.j8;
import com.aspose.slides.internal.f4l.s0;
import com.aspose.slides.internal.f4l.v3;
import com.aspose.slides.internal.f4l.v8;
import com.aspose.slides.internal.f4l.y0;
import com.aspose.slides.internal.u0b.e9;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

public final class a0 implements IDisposable, Shape {
   private static y1 n5 = new y1(-4194304.0F, -4194304.0F, 8388608.0F, 8388608.0F);
   private s0 l6;
   private Shape k5 = null;
   private static final long[] u3 = new long[]{
      0L,
      1996959894L,
      -301047508L,
      -1727442502L,
      124634137L,
      1886057615L,
      -379345611L,
      -1637575261L,
      249268274L,
      2044508324L,
      -522852066L,
      -1747789432L,
      162941995L,
      2125561021L,
      -407360249L,
      -1866523247L,
      498536548L,
      1789927666L,
      -205950648L,
      -2067906082L,
      450548861L,
      1843258603L,
      -187386543L,
      -2083289657L,
      325883990L,
      1684777152L,
      -43845254L,
      -1973040660L,
      335633487L,
      1661365465L,
      -99664541L,
      -1928851979L,
      997073096L,
      1281953886L,
      -715111964L,
      -1570279054L,
      1006888145L,
      1258607687L,
      -770865667L,
      -1526024853L,
      901097722L,
      1119000684L,
      -608450090L,
      -1396901568L,
      853044451L,
      1172266101L,
      -589951537L,
      -1412350631L,
      651767980L,
      1373503546L,
      -925412992L,
      -1076862698L,
      565507253L,
      1454621731L,
      -809855591L,
      -1195530993L,
      671266974L,
      1594198024L,
      -972236366L,
      -1324619484L,
      795835527L,
      1483230225L,
      -1050600021L,
      -1234817731L,
      1994146192L,
      31158534L,
      -1731059524L,
      -271249366L,
      1907459465L,
      112637215L,
      -1614814043L,
      -390540237L,
      2013776290L,
      251722036L,
      -1777751922L,
      -519137256L,
      2137656763L,
      141376813L,
      -1855689577L,
      -429695999L,
      1802195444L,
      476864866L,
      -2056965928L,
      -228458418L,
      1812370925L,
      453092731L,
      -2113342271L,
      -183516073L,
      1706088902L,
      314042704L,
      -1950435094L,
      -54949764L,
      1658658271L,
      366619977L,
      -1932296973L,
      -69972891L,
      1303535960L,
      984961486L,
      -1547960204L,
      -725929758L,
      1256170817L,
      1037604311L,
      -1529756563L,
      -740887301L,
      1131014506L,
      879679996L,
      -1385723834L,
      -631195440L,
      1141124467L,
      855842277L,
      -1442165665L,
      -586318647L,
      1342533948L,
      654459306L,
      -1106571248L,
      -921952122L,
      1466479909L,
      544179635L,
      -1184443383L,
      -832445281L,
      1591671054L,
      702138776L,
      -1328506846L,
      -942167884L,
      1504918807L,
      783551873L,
      -1212326853L,
      -1061524307L,
      -306674912L,
      -1698712650L,
      62317068L,
      1957810842L,
      -355121351L,
      -1647151185L,
      81470997L,
      1943803523L,
      -480048366L,
      -1805370492L,
      225274430L,
      2053790376L,
      -468791541L,
      -1828061283L,
      167816743L,
      2097651377L,
      -267414716L,
      -2029476910L,
      503444072L,
      1762050814L,
      -144550051L,
      -2140837941L,
      426522225L,
      1852507879L,
      -19653770L,
      -1982649376L,
      282753626L,
      1742555852L,
      -105259153L,
      -1900089351L,
      397917763L,
      1622183637L,
      -690576408L,
      -1580100738L,
      953729732L,
      1340076626L,
      -776247311L,
      -1497606297L,
      1068828381L,
      1219638859L,
      -670225446L,
      -1358292148L,
      906185462L,
      1090812512L,
      -547295293L,
      -1469587627L,
      829329135L,
      1181335161L,
      -882789492L,
      -1134132454L,
      628085408L,
      1382605366L,
      -871598187L,
      -1156888829L,
      570562233L,
      1426400815L,
      -977650754L,
      -1296233688L,
      733239954L,
      1555261956L,
      -1026031705L,
      -1244606671L,
      752459403L,
      1541320221L,
      -1687895376L,
      -328994266L,
      1969922972L,
      40735498L,
      -1677130071L,
      -351390145L,
      1913087877L,
      83908371L,
      -1782625662L,
      -491226604L,
      2075208622L,
      213261112L,
      -1831694693L,
      -438977011L,
      2094854071L,
      198958881L,
      -2032938284L,
      -237706686L,
      1759359992L,
      534414190L,
      -2118248755L,
      -155638181L,
      1873836001L,
      414664567L,
      -2012718362L,
      -15766928L,
      1711684554L,
      285281116L,
      -1889165569L,
      -127750551L,
      1634467795L,
      376229701L,
      -1609899400L,
      -686959890L,
      1308918612L,
      956543938L,
      -1486412191L,
      -799009033L,
      1231636301L,
      1047427035L,
      -1362007478L,
      -640263460L,
      1088359270L,
      936918000L,
      -1447252397L,
      -558129467L,
      1202900863L,
      817233897L,
      -1111625188L,
      -893730166L,
      1404277552L,
      615818150L,
      -1160759803L,
      -841546093L,
      1423857449L,
      601450431L,
      -1285129682L,
      -1000256840L,
      1567103746L,
      711928724L,
      -1274298825L,
      -1022587231L,
      1510334235L,
      755167117L
   };

   public a0() {
      this.l6 = new s0();
      this.l6.n5(0);
      v8 var1 = new v8();
      var1.n5(268435459);
      this.l6.n5(new v8[]{var1});
   }

   public a0(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      this.l6 = new s0();
      this.l6.n5(0);
      this.l6.n5(new v8[]{this.a6(var1)});
   }

   public a0(com.aspose.slides.internal.x4g.w1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("rgnData");
      }

      if (var1.n5() == null) {
         throw new NullReferenceException();
      }

      if (var1.n5().length < 16) {
         throw new ArgumentException();
      }

      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(new com.aspose.slides.internal.z0k.e2(var1.n5()));
      int var3 = var2.m3();
      int var4 = var2.m3();
      this.l6 = e9.n5(var2);
   }

   public a0(y2 var1) {
      this.l6 = new s0();
      this.l6.n5(0);
      this.l6.n5(new v8[]{a6(y1.n5(var1))});
   }

   public a0(y1 var1) {
      this.l6 = new s0();
      this.l6.n5(0);
      this.l6.n5(new v8[]{a6(var1)});
   }

   public Area n5() {
      return (Area)this.u9();
   }

   public final a0 l6() {
      return new a0(this.k5());
   }

   public final void n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      if (this.t2() || var1.c8()) {
         this.u3();
      } else if (this.c8()) {
         this.l6.n5(new v8[]{var1.l6.l6()[0]});
         this.l6.n5(0);
      } else {
         v8 var2 = new v8();
         var2.n5(5);
         var2.n5(this.n5(this.l6.l6()[0], var1.l6.l6()[0], 4));
         this.l6.n5(new v8[]{var2});
         this.l6.n5(this.l6.n5() + 2);
         this.k5 = null;
      }
   }

   @Override
   public final void dispose() {
      this.l6 = null;
      this.k5 = null;
   }

   public final void n5(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      if (!this.c8()) {
         v8 var2 = new v8();
         var2.n5(4);
         var2.n5(this.n5(this.l6.l6()[0], this.a6(var1), 3));
         this.l6.n5(new v8[]{var2});
         this.l6.n5(this.l6.n5() + 2);
         this.k5 = null;
      }
   }

   public final void n5(y2 var1) {
      this.n5(y1.n5(var1));
   }

   public final void n5(y1 var1) {
      if (!this.c8() && !var1.u3()) {
         v8 var2 = new v8();
         var2.n5(4);
         var2.n5(this.n5(this.l6.l6()[0], a6(var1), 3));
         this.l6.n5(new v8[]{var2});
         this.l6.n5(this.l6.n5() + 2);
         this.k5 = null;
      }
   }

   public final void l6(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      if (var1.t2()) {
         this.u3();
      } else {
         if (this.c8() || var1.c8()) {
            return;
         }

         v8 var2 = new v8();
         var2.n5(4);
         var2.n5(this.n5(this.l6.l6()[0], var1.l6.l6()[0], 3));
         this.l6.n5(new v8[]{var2});
         this.l6.n5(this.l6.n5() + 2);
         this.k5 = null;
      }
   }

   public final y1 n5(z1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("graphics");
      }

      if (a0$n5.n5(this)) {
         return new y1(this.n5().getBounds2D());
      }

      Rectangle2D var2 = this.n5(this.l6.l6()[0]);
      return new y1(var2.getBounds2D());
   }

   private Rectangle2D n5(v8 var1) {
      switch (var1.l6()) {
         case 1:
            v3 var10 = (v3)var1.n5();
            Rectangle2D var14 = this.n5(var10.n5());
            Rectangle2D var18 = this.n5(var10.l6());
            return var14.createIntersection(var18);
         case 2:
            v3 var9 = (v3)var1.n5();
            Rectangle2D var13 = this.n5(var9.n5());
            Rectangle2D var17 = this.n5(var9.l6());
            var13.add(var17);
            return var13;
         case 3:
            v3 var8 = (v3)var1.n5();
            Rectangle2D var12 = this.n5(var8.n5());
            Rectangle2D var16 = this.n5(var8.l6());
            if (var12.getWidth() != 0.0 && var12.getHeight() != 0.0 && var16.getWidth() != 0.0 && var16.getHeight() != 0.0) {
               Area var20 = new Area(var12);
               var20.exclusiveOr(new Area(var16));
               return var20.getBounds2D();
            } else {
               if (var12.getWidth() != 0.0 && var12.getHeight() != 0.0) {
                  return var12;
               }

               return new Float();
            }
         case 4:
            v3 var7 = (v3)var1.n5();
            Rectangle2D var11 = this.n5(var7.n5());
            Rectangle2D var15 = this.n5(var7.l6());
            if (var11.getWidth() != 0.0 && var11.getHeight() != 0.0 && var15.getWidth() != 0.0 && var15.getHeight() != 0.0) {
               Area var19 = new Area(var11);
               var19.subtract(new Area(var15));
               return var19.getBounds2D();
            } else {
               if (var11.getWidth() != 0.0 && var11.getHeight() != 0.0) {
                  return var11;
               }

               return new Float();
            }
         case 5:
            v3 var6 = (v3)var1.n5();
            Rectangle2D var3 = this.n5(var6.n5());
            Rectangle2D var4 = this.n5(var6.l6());
            if (var3.getWidth() != 0.0 && var3.getHeight() != 0.0 && var4.getWidth() != 0.0 && var4.getHeight() != 0.0) {
               Area var5 = new Area(var4);
               var5.subtract(new Area(var3));
               return var5.getBounds2D();
            } else {
               if (var4.getWidth() != 0.0 && var4.getHeight() != 0.0) {
                  return var4;
               }

               return new Float();
            }
         case 268435456:
            j8 var2 = (j8)var1.n5();
            return new Float(var2.n5().n5(), var2.n5().l6(), var2.n5().k5(), var2.n5().u3());
         case 268435457:
            throw new ArgumentException("Use java.awt.geom.Area.getBounds() if Region object contains Path");
         case 268435458:
            return new Float();
         case 268435459:
            return n5.y4().n5();
         default:
            throw new ArgumentException("EmfPlusRegionNodeDataType is invalid");
      }
   }

   public final com.aspose.slides.internal.x4g.w1 k5() {
      int var1 = this.l6.k5();
      byte[] var2 = new byte[var1 + 8];
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(var2);
      com.aspose.slides.internal.z0k.l6 var4 = new com.aspose.slides.internal.z0k.l6(var3);
      var4.l6(var1);
      byte var5 = 0;
      var4.l6(var5);
      com.aspose.slides.internal.m2n.u9.n5(this.l6, var4);
      this.n5(var2);
      return new com.aspose.slides.internal.x4g.w1(var2);
   }

   public final y1[] n5(com.aspose.slides.internal.x4g.m1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("matrix");
      }

      if (this.t2()) {
         return new y1[]{new y1(this.n5().getBounds2D())};
      }

      if (this.c8()) {
         return new y1[0];
      }

      a0 var2 = this.l6();
      var2.l6(var1);
      return a0$n5.n5(var2) ? s3.n5(var2) : a0$n5.l6(var2);
   }

   public final void l6(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      if (this.t2()) {
         this.l6.n5(new v8[]{this.a6(var1)});
         this.l6.n5(0);
      } else {
         if (this.c8()) {
            return;
         }

         v8 var2 = new v8();
         var2.n5(1);
         var2.n5(this.n5(this.l6.l6()[0], this.a6(var1), 0));
         this.l6.n5(new v8[]{var2});
         this.l6.n5(this.l6.n5() + 2);
         this.k5 = null;
      }
   }

   public final void l6(y2 var1) {
      this.l6(y1.n5(var1));
   }

   public final void l6(y1 var1) {
      if (this.t2()) {
         this.l6.n5(new v8[]{a6(var1)});
         this.l6.n5(0);
      } else {
         if (this.c8()) {
            return;
         }

         if (var1.u3()) {
            this.u3();
         } else {
            v8 var2 = new v8();
            var2.n5(1);
            var2.n5(this.n5(this.l6.l6()[0], a6(var1), 0));
            this.l6.n5(new v8[]{var2});
            this.l6.n5(this.l6.n5() + 2);
            this.k5 = null;
         }
      }
   }

   public final void k5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      if (this.t2()) {
         this.l6.n5(new v8[]{var1.l6.l6()[0]});
         this.l6.n5(0);
      } else {
         if (this.c8() || var1.t2()) {
            return;
         }

         if (var1.c8()) {
            this.u3();
         } else {
            v8 var2 = new v8();
            var2.n5(1);
            var2.n5(this.n5(this.l6.l6()[0], var1.l6.l6()[0], 0));
            this.l6.n5(new v8[]{var2});
            this.l6.n5(this.l6.n5() + 2);
            this.k5 = null;
         }
      }
   }

   public final boolean l6(z1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("g");
      } else {
         return this.c8() ? true : this.n5(var1).u3();
      }
   }

   private boolean c8() {
      return this.l6.l6()[0].l6() == 268435458;
   }

   public final boolean k5(z1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("g");
      }

      if (this.t2()) {
         return true;
      }

      a0 var2 = this.l6();
      var2.l6(var1.m1());
      if (var2.l6.n5() == 0) {
         if (var2.l6.l6()[0].l6() == 268435456) {
            j8 var5 = (j8)var2.l6.l6()[0].n5();
            return u3(this.n5(var5));
         } else if (var2.l6.l6()[0].l6() == 268435457) {
            g7 var3 = (g7)var2.l6.l6()[0].n5();
            a3 var4 = var3.n5();
            return var4.n5() == 4 ? u3(this.n5(var1)) : false;
         } else {
            return var2.l6.l6()[0].l6() == 268435459;
         }
      } else {
         return this.n5().contains(n5.n5());
      }
   }

   private static boolean u3(y1 var0) {
      return var0.s7() >= n5.s7() || var0.k5() >= n5.k5();
   }

   private boolean t2() {
      return this.l6.l6()[0].l6() == 268435459;
   }

   public final boolean n5(w1 var1, z1 var2) {
      Area var3 = this.n5();
      if (var2 != null) {
         var3 = var3.createTransformedArea(var2.m1().t2());
      }

      return var3.contains(var1.l6(), var1.k5());
   }

   public final boolean n5(float var1, float var2) {
      return this.n5(new w1(var1, var2), null);
   }

   public final void u3() {
      v8 var1 = new v8();
      var1.n5(268435458);
      this.l6.n5(0);
      this.l6.n5(new v8[]{var1});
      this.k5 = null;
   }

   public final void a6() {
      v8 var1 = new v8();
      var1.n5(268435459);
      this.l6.n5(0);
      this.l6.n5(new v8[]{var1});
      this.k5 = null;
   }

   public final void l6(com.aspose.slides.internal.x4g.m1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("matrix");
      }

      if (!var1.l6()) {
         this.l6.n5(new v8[]{this.n5(this.l6.l6()[0], var1)});
         this.k5 = null;
      }
   }

   public final void l6(float var1, float var2) {
      this.l6.n5(new v8[]{this.n5(this.l6.l6()[0], var1, var2)});
      this.k5 = null;
   }

   public final void k5(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      if (!this.t2()) {
         if (this.c8()) {
            this.l6.n5(new v8[]{this.a6(var1)});
            this.l6.n5(0);
         } else {
            v8 var2 = new v8();
            var2.n5(2);
            var2.n5(this.n5(this.l6.l6()[0], this.a6(var1), 1));
            this.l6.n5(new v8[]{var2});
            this.l6.n5(this.l6.n5() + 2);
            this.k5 = null;
         }
      }
   }

   public final void k5(y2 var1) {
      this.k5(y1.n5(var1));
   }

   public final void k5(y1 var1) {
      if (!this.t2() && !var1.u3()) {
         if (this.c8()) {
            this.l6.n5(new v8[]{a6(var1)});
            this.l6.n5(0);
         } else {
            v8 var2 = new v8();
            var2.n5(2);
            var2.n5(this.n5(this.l6.l6()[0], a6(var1), 1));
            this.l6.n5(new v8[]{var2});
            this.l6.n5(this.l6.n5() + 2);
            this.k5 = null;
         }
      }
   }

   public final void u3(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      if (!this.t2() && !var1.c8()) {
         if (!this.c8() && !var1.t2()) {
            v8 var2 = new v8();
            var2.n5(2);
            var2.n5(this.n5(this.l6.l6()[0], var1.l6.l6()[0], 1));
            this.l6.n5(new v8[]{var2});
            this.l6.n5(this.l6.n5() + 2);
            this.k5 = null;
         } else {
            this.l6.n5(new v8[]{var1.l6.l6()[0]});
            this.l6.n5(0);
         }
      }
   }

   public final void u3(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("path");
      }

      if (this.c8()) {
         this.l6.n5(new v8[]{this.a6(var1)});
         this.l6.n5(0);
      } else {
         v8 var2 = new v8();
         var2.n5(3);
         var2.n5(this.n5(this.l6.l6()[0], this.a6(var1), 2));
         this.l6.n5(new v8[]{var2});
         this.l6.n5(this.l6.n5() + 2);
         this.k5 = null;
      }
   }

   public final void a6(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("region");
      }

      if (!var1.c8()) {
         if (this.c8() && var1.t2()) {
            this.a6();
         } else if (this.t2() && var1.t2()) {
            this.u3();
         } else {
            v8 var2 = new v8();
            var2.n5(3);
            var2.n5(this.n5(this.l6.l6()[0], var1.l6.l6()[0], 2));
            this.l6.n5(new v8[]{var2});
            this.l6.n5(this.l6.n5() + 2);
            this.k5 = null;
         }
      }
   }

   private v8 a6(com.aspose.slides.internal.x4g.s7 var1) {
      v8 var2 = new v8();
      var2.n5(268435457);
      g7 var3 = new g7();
      a3 var4 = this.u9(var1);
      var3.n5(var4.c8());
      var3.n5(var4);
      var2.n5(var3);
      return var2;
   }

   private static v8 a6(y1 var0) {
      v8 var1 = new v8();
      var1.n5(268435456);
      var1.n5(u9(var0));
      return var1;
   }

   private v3 n5(v8 var1, v8 var2, int var3) {
      v3 var4 = new v3();
      var4.n5(var1);
      var4.l6(var2);
      var4.n5(var3);
      return var4;
   }

   private void n5(byte[] var1) {
      long var2 = 0L;
      int var4 = var1[0] | var1[1] << 8 | var1[2] << 16 | var1[3] << 24;

      for (int var5 = 0; var5 < var4; var5++) {
         long var6 = var1[var5 + 8] & 4294967295L;
         var6 = (var6 ^ var2) & 4294967295L;
         var2 >>= 8;
         var2 ^= u3[(int)(var6 & 255L)] & 4294967295L;
      }

      var1[4] = (byte)(var2 & 255L);
      var1[5] = (byte)(var2 >> 8 & 255L);
      var1[6] = (byte)(var2 >> 16 & 255L);
      var1[7] = (byte)(var2 >> 24 & 255L);
   }

   private v8 n5(v8 var1, float var2, float var3) {
      switch (var1.l6()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            v3 var10 = (v3)var1.n5();
            var10.n5(this.n5(var10.n5(), var2, var3));
            var10.l6(this.n5(var10.l6(), var2, var3));
            var1.n5(var10);
            break;
         case 268435456:
            j8 var4 = (j8)var1.n5();
            com.aspose.slides.internal.y5s.w1 var5 = var4.n5();
            var5.n5(var5.n5() + var2);
            var5.l6(var5.l6() + var3);
            var4.n5(var5);
            var1.n5(var4);
            break;
         case 268435457:
            g7 var6 = (g7)var1.n5();
            a3 var7 = var6.n5();

            for (int var8 = 0; var8 < var7.n5(); var8++) {
               com.aspose.slides.internal.y5s.m1 var9 = (com.aspose.slides.internal.y5s.m1)var7.k5().get_Item(var8);
               var9.n5(var9.n5() + var2);
               var9.l6(var9.l6() + var3);
               var7.k5().set_Item(var8, var9);
            }

            var6.n5(var7);
            var1.n5(var6);
         case 268435458:
         case 268435459:
      }

      return var1;
   }

   private v8 n5(v8 var1, com.aspose.slides.internal.x4g.m1 var2) {
      switch (var1.l6()) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            v3 var11 = (v3)var1.n5();
            var11.n5(this.n5(var11.n5(), var2));
            var11.l6(this.n5(var11.l6(), var2));
            var1.n5(var11);
            break;
         case 268435456:
            if (var2.n5()[1] == 0.0F && var2.n5()[2] == 0.0F) {
               j8 var10 = (j8)var1.n5();
               w1[] var12 = new w1[]{new w1(var10.n5().n5(), var10.n5().l6()), new w1(var10.n5().n5() + var10.n5().k5(), var10.n5().l6() + var10.n5().u3())};
               var2.n5(var12);
               var1.n5(u9(new y1(var12[0], new f2(var12[1].l6() - var12[0].l6(), var12[1].k5() - var12[0].k5()))));
            } else {
               j8 var3 = (j8)var1.n5();
               a3 var4 = this.u9(com.aspose.slides.internal.x4g.s7.n5((Object)(this.n5(var3).n5())));

               for (com.aspose.slides.internal.f4l.u3 var8 : var4.a6()) {
                  y0 var9 = (y0)var8;
                  if (var9.n5() != 0) {
                     var9.n5(1);
                  }
               }

               g7 var13 = new g7();
               var13.n5(new a3());
               var13.n5(var4);
               var13.n5(var4.c8());
               var1.n5(268435457);
               var1.n5(var13);
               this.l6(var1, var2);
            }
            break;
         case 268435457:
            this.l6(var1, var2);
         case 268435458:
         case 268435459:
      }

      return var1;
   }

   private void l6(v8 var1, com.aspose.slides.internal.x4g.m1 var2) {
      g7 var3 = (g7)var1.n5();
      a3 var4 = var3.n5();
      w1[] var5 = this.n5(var4.k5());
      if (var5.length > 0) {
         var2.n5(var5);
         var4.n5(this.n5(var5));
      }

      var3.n5(var4);
      var1.n5(var3);
   }

   private a3 u9(com.aspose.slides.internal.x4g.s7 var1) {
      if (var1 == null) {
         return null;
      }

      a3 var2 = new a3();
      if (var1.u3().n5().length == 0) {
         var2.n5(0);
         var2.n5(com.aspose.slides.ms.System.u3.n5((Object)(new Object[0])));
         var2.n5((short)0);
         var2.n5(new y0[0]);
         return var2;
      }

      byte[] var3 = var1.u9();
      w1[] var4 = var1.a6();
      var2.n5(var4.length);
      var2.n5(this.n5(var4));
      y0[] var5 = new y0[var3.length];

      for (int var6 = 0; var6 < var3.length; var6++) {
         y0 var7 = new y0();
         var7.n5(var3[var6]);
         var5[var6] = var7;
      }

      var2.n5(var5);
      if (var1.k5() == 1) {
         var2.n5((short)n5(var2.l6(), 13, true));
      }

      return var2;
   }

   private static j8 u9(y1 var0) {
      j8 var1 = new j8();
      com.aspose.slides.internal.y5s.w1 var2 = new com.aspose.slides.internal.y5s.w1(var0.x8(), var0.n3(), var0.s7(), var0.k5());
      if (var2.k5() < 0.0F) {
         var2.n5(var2.n5() + var2.k5());
         var2.k5(-var2.k5());
      }

      if (var2.u3() < 0.0F) {
         var2.l6(var2.l6() + var2.u3());
         var2.u3(-var2.u3());
      }

      var1.n5(var2);
      return var1;
   }

   private w1[] n5(com.aspose.slides.ms.System.u3 var1) {
      if (var1 == null) {
         return null;
      }

      w1[] var2 = new w1[var1.a6()];

      for (int var3 = 0; var3 < var1.a6(); var3++) {
         var2[var3] = n5((com.aspose.slides.internal.y5s.m1)var1.get_Item(var3));
      }

      return var2;
   }

   private y1 n5(j8 var1) {
      return new y1(var1.n5().n5(), var1.n5().l6(), var1.n5().k5(), var1.n5().u3());
   }

   private static w1 n5(com.aspose.slides.internal.y5s.m1 var0) {
      return new w1(var0.n5(), var0.l6());
   }

   private com.aspose.slides.ms.System.u3 n5(w1[] var1) {
      if (var1 == null) {
         return null;
      }

      com.aspose.slides.internal.y5s.m1[] var2 = new com.aspose.slides.internal.y5s.m1[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = new com.aspose.slides.internal.y5s.m1(var1[var3].l6(), var1[var3].k5());
      }

      return com.aspose.slides.ms.System.u3.n5((Object)(var2));
   }

   static com.aspose.slides.internal.x4g.s7 n5(a3 var0) {
      byte[] var1 = new byte[var0.a6().length];
      w1[] var2 = new w1[var0.k5().a6()];

      for (int var3 = 0; var3 < var0.a6().length; var3++) {
         var1[var3] = (byte)((y0)var0.a6()[var3]).n5();
      }

      for (int var4 = 0; var4 < var0.k5().a6(); var4++) {
         var2[var4] = n5((com.aspose.slides.internal.y5s.m1)var0.k5().get_Item(var4));
      }

      com.aspose.slides.internal.x4g.s7 var5 = new com.aspose.slides.internal.x4g.s7(var2, var1);
      var5.n5(n5(var0.l6(), 13) ? 1 : 0);
      return var5;
   }

   private static int n5(int var0, int var1, boolean var2) {
      int var3 = 1 << var1;
      int var4 = var0;
      if (var2) {
         var4 |= var3;
      } else {
         var4 &= ~var3;
      }

      return var4;
   }

   private static boolean n5(short var0, int var1) {
      boolean var2 = false;
      int var3 = 1 << var1;
      if ((var0 & var3) == var3) {
         var2 = true;
      }

      return var2;
   }

   protected Shape u9() {
      if (this.k5 == null) {
         this.s7();
      }

      return this.k5;
   }

   private void s7() {
      this.k5 = this.l6(this.l6.l6()[0]);
   }

   private Area l6(v8 var1) {
      switch (var1.l6()) {
         case 1:
            v3 var9 = (v3)var1.n5();
            Area var14 = this.l6(var9.n5());
            Area var18 = this.l6(var9.l6());
            var14.intersect(var18);
            return var14;
         case 2:
            v3 var8 = (v3)var1.n5();
            Area var13 = this.l6(var8.n5());
            Area var17 = this.l6(var8.l6());
            var13.add(var17);
            return var13;
         case 3:
            v3 var7 = (v3)var1.n5();
            Area var12 = this.l6(var7.n5());
            Area var16 = this.l6(var7.l6());
            var12.exclusiveOr(var16);
            return var12;
         case 4:
            v3 var6 = (v3)var1.n5();
            Area var11 = this.l6(var6.n5());
            Area var15 = this.l6(var6.l6());
            var11.subtract(var15);
            return var11;
         case 5:
            v3 var5 = (v3)var1.n5();
            Area var10 = this.l6(var5.n5());
            Area var4 = this.l6(var5.l6());
            var4.subtract(var10);
            return var4;
         case 268435456:
            j8 var2 = (j8)var1.n5();
            return new Area(new Float(var2.n5().n5(), var2.n5().l6(), var2.n5().k5(), var2.n5().u3()));
         case 268435457:
            g7 var3 = (g7)var1.n5();
            return new Area(n5(var3.n5()));
         case 268435458:
            return new Area();
         case 268435459:
            return new Area(n5.n5());
         default:
            throw new ArgumentException("EmfPlusRegionNodeDataType is invalid");
      }
   }

   @Override
   public Rectangle getBounds() {
      return this.n5().getBounds();
   }

   @Override
   public Rectangle2D getBounds2D() {
      return this.n5().getBounds2D();
   }

   @Override
   public boolean contains(double x, double y) {
      return this.n5().contains(x, y);
   }

   @Override
   public boolean contains(Point2D p) {
      return this.n5().contains(p);
   }

   @Override
   public boolean intersects(double x, double y, double w, double h) {
      return this.n5().intersects(x, y, w, h);
   }

   @Override
   public boolean intersects(Rectangle2D r) {
      return this.n5().intersects(r);
   }

   @Override
   public boolean contains(double x, double y, double w, double h) {
      return this.n5().contains(x, y, w, h);
   }

   @Override
   public boolean contains(Rectangle2D r) {
      return this.n5().contains(r);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at) {
      return this.n5().getPathIterator(at);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at, double flatness) {
      return this.n5().getPathIterator(at, flatness);
   }

   // $VF: synthetic method
   static s0 u9(a0 var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static y1 h0() {
      return n5;
   }
}
