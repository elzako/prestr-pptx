package com.aspose.slides.internal.z1n;

import com.aspose.slides.internal.c1x.a6;
import com.aspose.slides.internal.c1x.c4;
import com.aspose.slides.internal.c1x.c8;
import com.aspose.slides.internal.c1x.e2;
import com.aspose.slides.internal.c1x.j5;
import com.aspose.slides.internal.c1x.m1;
import com.aspose.slides.internal.c1x.m3;
import com.aspose.slides.internal.c1x.n3;
import com.aspose.slides.internal.c1x.q0;
import com.aspose.slides.internal.c1x.r4;
import com.aspose.slides.internal.c1x.s7;
import com.aspose.slides.internal.c1x.t2;
import com.aspose.slides.internal.c1x.w1;
import com.aspose.slides.internal.c1x.x8;
import com.aspose.slides.internal.c1x.y1;
import com.aspose.slides.internal.c1x.y2;
import com.aspose.slides.internal.c1x.y4;
import com.aspose.slides.internal.c1x.z1;
import com.aspose.slides.internal.c1x.z3;
import com.aspose.slides.internal.g4u.h0;
import com.aspose.slides.internal.l8r.u3;
import com.aspose.slides.internal.l8r.u9;
import com.aspose.slides.internal.n2z.k5;
import com.aspose.slides.internal.z6e.a0;
import com.aspose.slides.internal.z6e.a5;
import com.aspose.slides.internal.z6e.b3;
import com.aspose.slides.internal.z6e.d2;
import com.aspose.slides.internal.z6e.d5;
import com.aspose.slides.internal.z6e.e5;
import com.aspose.slides.internal.z6e.f2;
import com.aspose.slides.internal.z6e.h2;
import com.aspose.slides.internal.z6e.i1;
import com.aspose.slides.internal.z6e.k7;
import com.aspose.slides.internal.z6e.o0;
import com.aspose.slides.internal.z6e.s3;
import com.aspose.slides.internal.z6e.t1;
import com.aspose.slides.internal.z6e.t4;
import com.aspose.slides.internal.z6e.t9;
import com.aspose.slides.internal.z6e.u6;
import com.aspose.slides.internal.z6e.v0;
import com.aspose.slides.internal.z6e.v4;
import com.aspose.slides.internal.z6e.z7;
import com.aspose.slides.internal.z6e.z8;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class l6 {
   int n5;
   private InputStream l6;
   private int k5;
   private List<k5> u3 = new ArrayList<>();

   public l6() {
      this.l6 = null;
      this.k5 = 0;
      this.n5 = 65536;
   }

   public void n5(InputStream var1) throws com.aspose.slides.internal.p7x.l6 {
      if (var1 == null) {
         throw new InvalidParameterException("stream cannot be null");
      }

      this.l6 = var1;
   }

   public k5 n5() throws com.aspose.slides.internal.p7x.l6 {
      if (!this.u3.isEmpty()) {
         k5 var7 = this.u3.get(0);
         this.u3.remove(0);
         return var7;
      }

      try {
         int var1 = this.l6();
         int var2 = this.l6() - 8;
         if (var2 >= 0 && var2 <= this.n5) {
            byte[] var3 = new byte[var2];
            int var4 = this.n5(var3);
            k5 var5 = null;
            switch (var1) {
               case 1:
                  var5 = new com.aspose.slides.internal.o3i.l6();
                  break;
               case 2:
                  var5 = new k7();
                  break;
               case 3:
                  var5 = new e5();
                  break;
               case 4:
                  var5 = new o0();
                  break;
               case 5:
                  var5 = new z8();
                  break;
               case 6:
                  var5 = new v4();
                  break;
               case 7:
                  var5 = new d5();
                  break;
               case 8:
                  var5 = new a0();
                  break;
               case 9:
                  var5 = new y2();
                  break;
               case 10:
                  var5 = new y1();
                  break;
               case 11:
                  var5 = new r4();
                  break;
               case 12:
                  var5 = new c4();
                  break;
               case 13:
                  var5 = new y4();
                  break;
               case 14:
                  var5 = new com.aspose.slides.internal.o3i.n5();
                  break;
               case 15:
                  var5 = new a5();
                  break;
               case 16:
                  var5 = new z3();
                  break;
               case 17:
                  var5 = new q0();
                  break;
               case 18:
                  var5 = new n3();
                  break;
               case 19:
                  var5 = new com.aspose.slides.internal.c1x.k7();
                  break;
               case 20:
                  var5 = new m3();
                  break;
               case 21:
                  var5 = new com.aspose.slides.internal.c1x.z8();
                  break;
               case 22:
                  var5 = new j5();
                  break;
               case 23:
                  var5 = new e2();
                  break;
               case 24:
                  var5 = new w1();
                  break;
               case 25:
                  var5 = new x8();
                  break;
               case 26:
                  var5 = new u3();
                  break;
               case 27:
                  var5 = new com.aspose.slides.internal.c1x.l6();
                  break;
               case 28:
                  var5 = new u9();
                  break;
               case 29:
                  var5 = new com.aspose.slides.internal.l8r.n5();
                  break;
               case 30:
                  var5 = new com.aspose.slides.internal.l8r.k5();
                  break;
               case 31:
                  var5 = new c8();
                  break;
               case 32:
                  var5 = new t2();
                  break;
               case 33:
                  var5 = new com.aspose.slides.internal.c1x.u9();
                  break;
               case 34:
                  var5 = new a6();
                  break;
               case 35:
                  var5 = new com.aspose.slides.internal.j8m.l6();
                  break;
               case 36:
                  var5 = new com.aspose.slides.internal.j8m.n5();
                  break;
               case 37:
                  var5 = new com.aspose.slides.internal.y8m.k5();
                  break;
               case 38:
                  var5 = new h0();
                  break;
               case 39:
                  var5 = new com.aspose.slides.internal.g4u.l6();
                  break;
               case 40:
                  var5 = new com.aspose.slides.internal.y8m.n5();
                  break;
               case 41:
                  var5 = new com.aspose.slides.internal.z6e.n5();
                  break;
               case 42:
                  var5 = new com.aspose.slides.internal.z6e.u9();
                  break;
               case 43:
                  var5 = new u6();
                  break;
               case 44:
                  var5 = new t1();
                  break;
               case 45:
                  var5 = new com.aspose.slides.internal.z6e.k5();
                  break;
               case 46:
                  var5 = new com.aspose.slides.internal.z6e.a6();
                  break;
               case 47:
                  var5 = new t4();
                  break;
               case 48:
                  var5 = new com.aspose.slides.internal.y8m.u3();
                  break;
               case 49:
                  var5 = new com.aspose.slides.internal.g4u.u9();
                  break;
               case 50:
                  var5 = new com.aspose.slides.internal.y8m.a6();
                  break;
               case 51:
                  var5 = new com.aspose.slides.internal.y8m.l6();
                  break;
               case 52:
                  var5 = new com.aspose.slides.internal.c1x.u3();
                  break;
               case 53:
                  var5 = new com.aspose.slides.internal.z6e.h0();
                  break;
               case 54:
                  var5 = new com.aspose.slides.internal.z6e.e2();
                  break;
               case 55:
                  var5 = new com.aspose.slides.internal.z6e.u3();
                  break;
               case 56:
                  var5 = new com.aspose.slides.internal.z6e.r4();
                  break;
               case 57:
                  var5 = new s7();
                  break;
               case 58:
                  var5 = new m1();
                  break;
               case 59:
                  var5 = new com.aspose.slides.internal.c7f.l6();
                  break;
               case 60:
                  var5 = new com.aspose.slides.internal.c7f.u3();
                  break;
               case 61:
                  var5 = new com.aspose.slides.internal.c7f.k5();
                  break;
               case 62:
                  var5 = new com.aspose.slides.internal.z6e.s7();
                  break;
               case 63:
                  var5 = new h2();
                  break;
               case 64:
                  var5 = new v0();
                  break;
               case 65:
                  var5 = new com.aspose.slides.internal.c7f.a6();
                  break;
               case 66:
                  var5 = new com.aspose.slides.internal.c7f.u9();
                  break;
               case 67:
                  var5 = new com.aspose.slides.internal.l8r.a6();
                  break;
               case 68:
                  var5 = new com.aspose.slides.internal.c7f.n5();
                  break;
               case 69:
               case 99:
               case 100:
               case 101:
               case 102:
               case 103:
               case 105:
               case 106:
               case 107:
               case 108:
               case 109:
               case 110:
               case 111:
               case 112:
               case 113:
               case 116:
               case 117:
               default:
                  var5 = new com.aspose.slides.internal.s1o.n5(var1);
                  break;
               case 70:
                  var5 = new com.aspose.slides.internal.x1f.n5();
                  break;
               case 71:
                  var5 = new com.aspose.slides.internal.z6e.x8();
                  break;
               case 72:
                  var5 = new com.aspose.slides.internal.z6e.n3();
                  break;
               case 73:
                  var5 = new com.aspose.slides.internal.c1x.n5();
                  break;
               case 74:
                  var5 = new t9();
                  break;
               case 75:
                  var5 = new com.aspose.slides.internal.l8r.l6();
                  break;
               case 76:
                  var5 = new com.aspose.slides.internal.w8d.l6();
                  break;
               case 77:
                  var5 = new com.aspose.slides.internal.w8d.u9();
                  break;
               case 78:
                  var5 = new com.aspose.slides.internal.w8d.k5();
                  break;
               case 79:
                  var5 = new com.aspose.slides.internal.w8d.u3();
                  break;
               case 80:
                  var5 = new com.aspose.slides.internal.w8d.a6();
                  break;
               case 81:
                  var5 = new com.aspose.slides.internal.w8d.h0();
                  break;
               case 82:
                  var5 = new com.aspose.slides.internal.g4u.u3();
                  break;
               case 83:
                  var5 = new com.aspose.slides.internal.z6e.c8();
                  break;
               case 84:
                  var5 = new com.aspose.slides.internal.z6e.t2();
                  break;
               case 85:
                  var5 = new com.aspose.slides.internal.z6e.m1();
                  break;
               case 86:
                  var5 = new i1();
                  break;
               case 87:
                  var5 = new b3();
                  break;
               case 88:
                  var5 = new com.aspose.slides.internal.z6e.m3();
                  break;
               case 89:
                  var5 = new z7();
                  break;
               case 90:
                  var5 = new d2();
                  break;
               case 91:
                  var5 = new com.aspose.slides.internal.z6e.y1();
                  break;
               case 92:
                  var5 = new com.aspose.slides.internal.z6e.j5();
                  break;
               case 93:
                  var5 = new com.aspose.slides.internal.g4u.a6();
                  break;
               case 94:
                  var5 = new com.aspose.slides.internal.g4u.k5();
                  break;
               case 95:
                  var5 = new com.aspose.slides.internal.g4u.c8();
                  break;
               case 96:
                  var5 = new s3();
                  break;
               case 97:
                  var5 = new f2();
                  break;
               case 98:
                  var5 = new z1();
                  break;
               case 104:
                  var5 = new com.aspose.slides.internal.c1x.k5();
                  break;
               case 114:
                  var5 = new com.aspose.slides.internal.w8d.n5();
                  break;
               case 115:
                  var5 = new com.aspose.slides.internal.c1x.t4();
                  break;
               case 118:
                  var5 = new com.aspose.slides.internal.z6e.y4();
            }

            var5.n5(var3, 0, var3.length);
            if (var5 instanceof com.aspose.slides.internal.o3i.n5) {
               this.u3.add(var5);
               var5 = this.u3.get(0);
               this.u3.remove(0);
            }

            return var5;
         } else {
            throw new com.aspose.slides.internal.p7x.l6("Error reading file.");
         }
      } catch (Exception var6) {
         throw new com.aspose.slides.internal.p7x.l6("Error reading Emf metafile", var6);
      }
   }

   private int l6() throws IOException {
      int var1 = 0;

      for (int var2 = 0; var2 < 4; var2++) {
         var1 >>>= 8;
         int var3 = this.l6.read();
         if (var3 < 0) {
            throw new IOException("Error reading DWORD");
         }

         var1 |= var3 << 24;
      }

      return var1;
   }

   private int n5(byte[] var1) throws IOException {
      return this.n5(var1, 0, var1.length);
   }

   private int n5(byte[] var1, int var2, int var3) throws IOException {
      int var4 = 0;
      int var5 = 1;

      while (var3 > 0 && var5 > 0) {
         var5 = this.l6.read(var1, var2, var3);
         if (var5 < 0) {
            var5 = 0;
         }

         var4 += var5;
         var2 += var5;
         var3 -= var5;
      }

      return var4;
   }

   public void n5(int var1) {
      this.n5 = var1;
   }
}
