package com.aspose.slides.internal.l9o;

import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

public class c8 extends n5 {
   private static final int[] t2 = new int[]{0, 64, 80, 96, 112, 128, 144, 160, 176, 192, 208, 224, 240};
   private static final int[] s7 = new int[]{0, 4, 4, 4, 4, 4, 4, 4, 4, 12, 12, 12, 12};
   private static final int[] x8 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 12, 12, 12, 12};
   private static final int[] n3 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 12, 12, 12};
   private static final int[] y4 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 12, 12};
   private static final int[] e2 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 12};
   private static final int[] t9 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 14};
   private static final int[] z1 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 14, 14};
   private static final int[] t4 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 6, 14, 14, 14};
   private static final int[] q0 = new int[]{2, 6, 6, 6, 6, 6, 6, 6, 6, 14, 14, 14, 14};
   private static final int[] z3 = new int[]{10, 10, 6, 6, 6, 6, 6, 6, 14, 14, 14, 14, 14};
   private static final int[] m1 = new int[]{10, 10, 10, 6, 6, 6, 6, 14, 14, 14, 14, 14, 14};
   private static final int[] k7 = new int[]{10, 10, 10, 10, 6, 6, 14, 14, 14, 14, 14, 14, 14};
   private static final int[] m3 = new int[]{10, 10, 10, 10, 10, 14, 14, 14, 14, 14, 14, 14, 14};
   private static final int[] z8 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 12, 12, 12, 12};
   private static final int[] j5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 12, 12, 12, 12};
   private static final int[] w1 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 12, 12};
   private static final int[] r4 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 12};
   private static final int[] c4 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12};
   private static final int[] y2 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 14};
   private static final int[] y1 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 14, 14};
   private static final int[] a0 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 14, 14, 14};
   private static final int[] d2 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 14, 14, 14, 14};
   private static final int[] d5 = new int[]{10, 10, 7, 7, 7, 7, 7, 7, 14, 14, 14, 14, 14};
   private static final int[] s3 = new int[]{10, 10, 10, 7, 7, 7, 7, 14, 14, 14, 14, 14, 14};
   private static final int[] p8 = new int[]{10, 10, 10, 10, 7, 7, 14, 14, 14, 14, 14, 14, 14};
   private static final int[] f2 = new int[]{10, 10, 10, 10, 10, 14, 14, 14, 14, 14, 14, 14, 14};
   private static final int[] i1 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 12, 12, 12};
   private static final int[] e5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 12, 12};
   private static final int[] b3 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 12};
   private static final int[] o0 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12};
   private static final int[] z7 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
   private static final int[] v4 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
   private static final int[] u6 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8};
   private static final int[] t1 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 14};
   private static final int[] a5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 14, 14};
   private static final int[] h2 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 14, 14, 14};
   private static final int[] v0 = new int[]{10, 10, 7, 7, 7, 7, 7, 7, 8, 14, 14, 14, 14};
   private static final int[] f0 = new int[]{10, 10, 10, 7, 7, 7, 7, 8, 14, 14, 14, 14, 14};
   private static final int[] a3 = new int[]{10, 10, 10, 10, 7, 7, 8, 14, 14, 14, 14, 14, 14};
   private static final int[] p3 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 12, 12};
   private static final int[] x9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12, 12};
   private static final int[] y0 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12};
   private static final int[] j9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
   private static final int[] z6 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
   private static final int[] e9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8};
   private static final int[] o5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8};
   private static final int[] j8 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8};
   private static final int[] w2 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8};
   private static final int[] s0 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
   private static final int[] v8 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 14};
   private static final int[] v3 = new int[]{10, 10, 7, 7, 7, 7, 8, 8, 8, 8, 8, 14, 14};
   private static final int[] g7 = new int[]{10, 10, 10, 7, 7, 8, 8, 8, 8, 8, 14, 14, 14};
   private static final int[] j4 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 12};
   private static final int[] i9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 12};
   private static final int[] f5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
   private static final int[] j3 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
   private static final int[] n1 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8};
   private static final int[] p6 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8};
   private static final int[] d1 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8};
   private static final int[] s4 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8};
   private static final int[] h6 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
   private static final int[] y8 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8};
   private static final int[] c3 = new int[]{3, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] l4 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] i6 = new int[]{10, 10, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] a7 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 13};
   private static final int[] r8 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 13};
   private static final int[] r1 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
   private static final int[] y5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8};
   private static final int[] k8 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8};
   private static final int[] b5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8};
   private static final int[] u8 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8};
   private static final int[] w5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
   private static final int[] q1 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8};
   private static final int[] u5 = new int[]{3, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] w8 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] c2 = new int[]{3, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] t3 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] u4 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 13, 13};
   private static final int[] s9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 13, 13};
   private static final int[] p7 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8};
   private static final int[] z5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8};
   private static final int[] h5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8};
   private static final int[] a8 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8};
   private static final int[] f4 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
   private static final int[] y9 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8};
   private static final int[] a1 = new int[]{3, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] w3 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] i4 = new int[]{3, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] q3 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] q2 = new int[]{11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] p4 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 5, 13, 13, 13};
   private static final int[] d6 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 13, 13, 13};
   private static final int[] y6 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 13};
   private static final int[] n7 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8};
   private static final int[] l5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8};
   private static final int[] u2 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
   private static final int[] d9 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8};
   private static final int[] c5 = new int[]{3, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] t5 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] j6 = new int[]{3, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] w9 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] m8 = new int[]{11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] b9 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 15};
   private static final int[] r6 = new int[]{1, 5, 5, 5, 5, 5, 5, 5, 5, 13, 13, 13, 13};
   private static final int[] r5 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 13, 13, 13, 13};
   private static final int[] h9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 13, 13};
   private static final int[] r7 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8};
   private static final int[] n9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
   private static final int[] a2 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8};
   private static final int[] h1 = new int[]{3, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] t6 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] v6 = new int[]{3, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] x0 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] o2 = new int[]{11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] e0 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 15};
   private static final int[] i2 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 15, 15};
   private static final int[] x7 = new int[]{9, 9, 5, 5, 5, 5, 5, 5, 13, 13, 13, 13, 13};
   private static final int[] z0 = new int[]{9, 9, 7, 7, 7, 7, 7, 7, 13, 13, 13, 13, 13};
   private static final int[] z9 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 7, 8, 13, 13, 13};
   private static final int[] f8 = new int[]{3, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8};
   private static final int[] s2 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8};
   private static final int[] n2 = new int[]{3, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] l0 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] p9 = new int[]{3, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] g8 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] i0 = new int[]{11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] b4 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 15};
   private static final int[] x5 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 15, 15};
   private static final int[] i8 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 15, 15, 15};
   private static final int[] a4 = new int[]{9, 9, 9, 5, 5, 5, 5, 13, 13, 13, 13, 13, 13};
   private static final int[] x3 = new int[]{9, 9, 9, 7, 7, 7, 7, 13, 13, 13, 13, 13, 13};
   private static final int[] b2 = new int[]{9, 9, 7, 7, 7, 7, 7, 7, 8, 13, 13, 13, 13};
   private static final int[] m4 = new int[]{3, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 13};
   private static final int[] b1 = new int[]{3, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] j1 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] k6 = new int[]{3, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] o7 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] v9 = new int[]{11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] r9 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 15};
   private static final int[] c7 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 15, 15};
   private static final int[] w4 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 15, 15, 15};
   private static final int[] n0 = new int[]{11, 11, 11, 11, 8, 8, 8, 8, 8, 15, 15, 15, 15};
   private static final int[] f1 = new int[]{9, 9, 9, 9, 5, 5, 13, 13, 13, 13, 13, 13, 13};
   private static final int[] k2 = new int[]{9, 9, 9, 9, 7, 7, 13, 13, 13, 13, 13, 13, 13};
   private static final int[] o8 = new int[]{9, 9, 9, 7, 7, 7, 7, 8, 13, 13, 13, 13, 13};
   private static final int[] n8 = new int[]{9, 9, 7, 7, 7, 7, 8, 8, 8, 8, 8, 13, 13};
   private static final int[] t0 = new int[]{3, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] n6 = new int[]{3, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] p5 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] b0 = new int[]{11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] r0 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 15};
   private static final int[] k3 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 15, 15};
   private static final int[] d7 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 15, 15, 15};
   private static final int[] o1 = new int[]{11, 11, 11, 11, 8, 8, 8, 8, 8, 15, 15, 15, 15};
   private static final int[] m0 = new int[]{11, 11, 11, 11, 8, 8, 8, 8, 15, 15, 15, 15, 15};
   private static final int[] o4 = new int[]{9, 9, 9, 9, 9, 13, 13, 13, 13, 13, 13, 13, 13};
   private static final int[] k1 = new int[]{9, 9, 9, 9, 9, 13, 13, 13, 13, 13, 13, 13, 13};
   private static final int[] o6 = new int[]{9, 9, 9, 9, 7, 7, 8, 13, 13, 13, 13, 13, 13};
   private static final int[] g2 = new int[]{9, 9, 9, 7, 7, 8, 8, 8, 8, 8, 13, 13, 13};
   private static final int[] l8 = new int[]{9, 9, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] s8 = new int[]{11, 11, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] i3 = new int[]{11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
   private static final int[] q6 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 8, 15};
   private static final int[] g1 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 8, 15, 15};
   private static final int[] k4 = new int[]{11, 11, 11, 8, 8, 8, 8, 8, 8, 8, 15, 15, 15};
   private static final int[] e8 = new int[]{11, 11, 11, 11, 8, 8, 8, 8, 8, 15, 15, 15, 15};
   private static final int[] b6 = new int[]{11, 11, 11, 11, 8, 8, 8, 8, 15, 15, 15, 15, 15};
   private static final int[] v7 = new int[]{11, 11, 11, 11, 8, 8, 8, 15, 15, 15, 15, 15, 15};
   private static final int[][] t7 = new int[][]{s7, x8, n3, y4, e2, t9, z1, t4, q0, z3, m1, k7, m3};
   private static final int[][] c9 = new int[][]{z8, j5, w1, r4, c4, y2, y1, a0, d2, d5, s3, p8, f2};
   private static final int[][] d3 = new int[][]{i1, e5, b3, o0, z7, v4, u6, t1, a5, h2, v0, f0, a3};
   private static final int[][] o3 = new int[][]{p3, x9, y0, j9, z6, e9, o5, j8, w2, s0, v8, v3, g7};
   private static final int[][] l1 = new int[][]{j4, i9, f5, j3, n1, p6, d1, s4, h6, y8, c3, l4, i6};
   private static final int[][] y7 = new int[][]{a7, r8, r1, y5, k8, b5, u8, w5, q1, u5, w8, c2, t3};
   private static final int[][] i7 = new int[][]{u4, s9, p7, z5, h5, a8, f4, y9, a1, w3, i4, q3, q2};
   private static final int[][] c6 = new int[][]{p4, d6, y6, n7, l5, u2, d9, c5, t5, j6, w9, m8, b9};
   private static final int[][] x1 = new int[][]{r6, r5, h9, r7, n9, a2, h1, t6, v6, x0, o2, e0, i2};
   private static final int[][] s6 = new int[][]{x7, z0, z9, f8, s2, n2, l0, p9, g8, i0, b4, x5, i8};
   private static final int[][] b7 = new int[][]{a4, x3, b2, m4, b1, j1, k6, o7, v9, r9, c7, w4, n0};
   private static final int[][] b8 = new int[][]{f1, k2, o8, n8, t0, n6, p5, b0, r0, k3, d7, o1, m0};
   private static final int[][] q7 = new int[][]{o4, k1, o6, g2, l8, s8, i3, q6, g1, k4, e8, b6, v7};
   private static final int[][][] r3 = new int[][][]{t7, c9, d3, o3, l1, y7, i7, c6, x1, s6, b7, b8, q7};

   public c8(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected void k5(byte[] var1) {
      if (this.a6 % 2 == 0) {
         this.n5(var1, this.a6, this.u9, this.h0, this.c8);
      } else {
         WritableRaster var2 = this.k5();
         com.aspose.slides.internal.p4t.l6 var3 = this.n5(var1);
         var3.n5(new t2(this, var2));
      }
   }

   private void n5(byte[] var1, int var2, int var3, int var4, int var5) {
      DataBufferByte var6 = (DataBufferByte)this.u3();
      byte[] var7 = var6.getData();
      int var8 = (int)Math.ceil(this.l6().getWidth() / 2.0F);
      int var9 = (int)Math.ceil(var4 / 2.0F);
      boolean var10 = var4 % 2 != 0;
      boolean var11 = var2 + var4 >= this.l6().getWidth();
      int var12 = var2 / 2;
      int var13 = var12 + var3 * var8;
      int var14 = 0;

      for (int var15 = 0; var15 < var5; var15++) {
         if (var10 && !var11) {
            System.arraycopy(var7, var13, var1, var14, var9 - 1);
            int var16 = var13 + var9 - 1;
            int var17 = var14 + var9 - 1;
            byte var18 = var7[var16];
            var1[var17] = (byte)(var18 & 240);
         } else {
            System.arraycopy(var7, var13, var1, var14, var9);
         }

         var13 += var8;
         var14 += this.k5 + var9;
      }
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.p4t.u3 var2) {
      var2.n5((byte)var1);
   }

   @Override
   protected com.aspose.slides.internal.p4t.u3 l6(byte[] var1) {
      return new com.aspose.slides.internal.p4t.u9(this.h0, this.k5, var1);
   }

   @Override
   protected int k5(int var1) {
      int var2 = var1 >> 16 & 0xFF;
      int var3 = var1 >> 8 & 0xFF;
      int var4 = var1 & 0xFF;
      return this.n5(var2, var3, var4);
   }

   private int n5(int var1, int var2, int var3) {
      int var4 = this.u3(var1);
      int var5 = this.u3(var2);
      int var6 = this.u3(var3);
      return r3[var4][var5][var6];
   }

   private int u3(int var1) {
      for (int var2 = 0; var2 < t2.length; var2++) {
         if (var1 < t2[var2]) {
            return var2 - 1;
         }
      }

      return t2.length - 1;
   }
}
