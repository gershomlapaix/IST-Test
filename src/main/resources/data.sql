-- school
INSERT INTO school (id, name, status, created_at, updated_at) VALUES('7ceb4e9c-5ae4-11ee-8c99-0242ac120002','ESG', 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO school (id, name, status, created_at, updated_at) VALUES('c88a2826-5ae6-11ee-8c99-0242ac120002','GS Gahini', 'ACTIVE', '1930-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')

-- grade
INSERT INTO grade (id, name, status, created_at, updated_at, school_id) VALUES('ec289876-5ae6-11ee-8c99-0242ac120002','Grade1', 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161', '7ceb4e9c-5ae4-11ee-8c99-0242ac120002')
INSERT INTO grade (id, name, status, created_at, updated_at, school_id) VALUES('fb56d5d8-5ae6-11ee-8c99-0242ac120002','Grade2', 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161', '7ceb4e9c-5ae4-11ee-8c99-0242ac120002')
INSERT INTO grade (id, name, status, created_at, updated_at, school_id) VALUES('464578c4-5ae7-11ee-8c99-0242ac120002','Grade4', 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161', 'c88a2826-5ae6-11ee-8c99-0242ac120002')

-- class
INSERT INTO the_class (id, name, status, created_at, updated_at, grade_id) VALUES('07b8bb5c-5ae7-11ee-8c99-0242ac120002','class A', 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161', 'ec289876-5ae6-11ee-8c99-0242ac120002')
INSERT INTO the_class (id, name, status, created_at, updated_at, grade_id) VALUES('12b1ac8a-5ae7-11ee-8c99-0242ac120002','class B', 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161', 'ec289876-5ae6-11ee-8c99-0242ac120002')
INSERT INTO the_class (id, name, status, created_at, updated_at, grade_id) VALUES('1aed53fe-5ae7-11ee-8c99-0242ac120002','class B', 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161', '464578c4-5ae7-11ee-8c99-0242ac120002')

--gradeClass
INSERT INTO grade_class (id, grade_id,class_id, status, created_at, updated_at) VALUES('87d092ae-5af3-11ee-8c99-0242ac120002','ec289876-5ae6-11ee-8c99-0242ac120002', '07b8bb5c-5ae7-11ee-8c99-0242ac120002' , 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO grade_class (id, grade_id,class_id, status, created_at, updated_at) VALUES('87d092ae-5af3-11ee-8c99-0242ac120004','ec289876-5ae6-11ee-8c99-0242ac120002', '12b1ac8a-5ae7-11ee-8c99-0242ac120002' , 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO grade_class (id, grade_id,class_id, status, created_at, updated_at) VALUES('87d092ae-5af3-11ee-8c99-0242ac120005','fb56d5d8-5ae6-11ee-8c99-0242ac120002', '07b8bb5c-5ae7-11ee-8c99-0242ac120002' , 'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')


--group
INSERT INTO groups (id, min_students, max_students, status, created_at, updated_at) VALUES('898c07a6-5ae7-11ee-8c99-0242ac120002',3, 10,'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO groups (id, min_students, max_students, status, created_at, updated_at) VALUES('f8705140-5ae7-11ee-8c99-0242ac120002',5, 20,'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO groups (id, min_students, max_students, status, created_at, updated_at) VALUES('7e356634-5ae9-11ee-8c99-0242ac120002',4, 8,'ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')

--student
INSERT INTO student (id, name, birth_date, status, created_at, updated_at) VALUES('519b856e-5ae8-11ee-8c99-0242ac120002','Mario Kareem','2004-05-24','ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO student (id, name, birth_date, status, created_at, updated_at) VALUES('fa413682-5ae8-11ee-8c99-0242ac120002','Jessica Flower','2000-05-24','INACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO student (id, name, birth_date, status, created_at, updated_at) VALUES('00fef7de-5ae9-11ee-8c99-0242ac120002','Jasmine Teta','2002-05-24','CANCELLED', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO student (id, name, birth_date, status, created_at, updated_at) VALUES('099f118a-5ae9-11ee-8c99-0242ac120002','Michel Mark','2003-05-24','INACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')
INSERT INTO student (id, name, birth_date, status, created_at, updated_at) VALUES('0eecc9de-5ae9-11ee-8c99-0242ac120002','Luke Mathew','2000-05-24','ACTIVE', '1998-05-24T14:02:29.204161', '2023-09-24T14:02:29.204161')

--group-student
INSERT INTO group_member (id, student_id, group_id, is_placed, status, created_at, updated_at) VALUES('1274a49e-5af5-11ee-8c99-0242ac120002','519b856e-5ae8-11ee-8c99-0242ac120002', '898c07a6-5ae7-11ee-8c99-0242ac120002',true,'ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')
INSERT INTO group_member (id, student_id, group_id, is_placed, status, created_at, updated_at) VALUES('1274a49e-5af5-11ee-8c99-0242ac120003','519b856e-5ae8-11ee-8c99-0242ac120002', 'f8705140-5ae7-11ee-8c99-0242ac120002',false, 'ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')
INSERT INTO group_member (id, student_id, group_id, is_placed, status, created_at, updated_at) VALUES('1274a49e-5af5-11ee-8c99-0242ac120004','fa413682-5ae8-11ee-8c99-0242ac120002', '7e356634-5ae9-11ee-8c99-0242ac120002',true, 'ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')
INSERT INTO group_member (id, student_id, group_id, is_placed, status, created_at, updated_at) VALUES('1274a49e-5af5-11ee-8c99-0242ac120005','00fef7de-5ae9-11ee-8c99-0242ac120002', 'f8705140-5ae7-11ee-8c99-0242ac120002',false, 'ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')


--subject
INSERT INTO subject (id, name, is_common, status, created_at, updated_at) VALUES('898c07a6-5ae7-11ee-8c99-0242ac120003','Mathematics','false','ACTIVE', '1998-05-25T14:02:29.204161', '2023-09-25T14:02:29.204161')
INSERT INTO subject (id, name, is_common, status, created_at, updated_at) VALUES('898c07a6-5ae7-11ee-8c99-0242ac120004','Science','false','ACTIVE', '1998-05-26T14:02:29.204161', '2023-09-26T14:02:29.204161')
INSERT INTO subject (id, name, is_common, status, created_at, updated_at) VALUES('898c07a6-5ae7-11ee-8c99-0242ac120005','History','true','ACTIVE', '1998-05-27T14:02:29.204161', '2023-09-27T14:02:29.204161')
INSERT INTO subject (id, name, is_common, status, created_at, updated_at) VALUES('898c07a6-5ae7-11ee-8c99-0242ac120006','Art','true','ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')

INSERT INTO student_subject (id, student_id, subject_id, status, created_at, updated_at) VALUES('6f66fc16-5af4-11ee-8c99-0242ac120002','519b856e-5ae8-11ee-8c99-0242ac120002', '898c07a6-5ae7-11ee-8c99-0242ac120003','ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')
INSERT INTO student_subject (id, student_id, subject_id, status, created_at, updated_at) VALUES('6f66fc16-5af4-11ee-8c99-0242ac120003','fa413682-5ae8-11ee-8c99-0242ac120002', '898c07a6-5ae7-11ee-8c99-0242ac120003','ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')
INSERT INTO student_subject (id, student_id, subject_id, status, created_at, updated_at) VALUES('6f66fc16-5af4-11ee-8c99-0242ac120004','00fef7de-5ae9-11ee-8c99-0242ac120002', '898c07a6-5ae7-11ee-8c99-0242ac120005','ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')
INSERT INTO student_subject (id, student_id, subject_id, status, created_at, updated_at) VALUES('6f66fc16-5af4-11ee-8c99-0242ac120005','fa413682-5ae8-11ee-8c99-0242ac120002', '898c07a6-5ae7-11ee-8c99-0242ac120005','ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')


--class group
INSERT INTO class_group (id, group_id, class_id, status, created_at, updated_at) VALUES('e1a6d054-5aee-11ee-8c99-0242ac120002','f8705140-5ae7-11ee-8c99-0242ac120002','07b8bb5c-5ae7-11ee-8c99-0242ac120002','ACTIVE', '1998-05-25T14:02:29.204161', '2023-09-25T14:02:29.204161')
INSERT INTO class_group (id, group_id, class_id, status, created_at, updated_at) VALUES('726d7022-5af2-11ee-8c99-0242ac120002','7e356634-5ae9-11ee-8c99-0242ac120002','07b8bb5c-5ae7-11ee-8c99-0242ac120002','ACTIVE', '1998-05-27T14:02:29.204161', '2023-09-27T14:02:29.204161')
INSERT INTO class_group (id, group_id, class_id, status, created_at, updated_at) VALUES('e1a6d054-5aee-11ee-8c99-0242ac120006','7e356634-5ae9-11ee-8c99-0242ac120002','1aed53fe-5ae7-11ee-8c99-0242ac120002','ACTIVE', '1998-05-28T14:02:29.204161', '2023-09-28T14:02:29.204161')
INSERT INTO class_group (id, group_id, class_id, status, created_at, updated_at) VALUES('e1a6d054-5aee-11ee-8c99-0242ac120007','7e356634-5ae9-11ee-8c99-0242ac120002','12b1ac8a-5ae7-11ee-8c99-0242ac120002','ACTIVE', '1998-05-29T14:02:29.204161', '2023-09-29T14:02:29.204161')

INSERT INTO group_subject (id, group_id, subject_id, status, created_at, updated_at) VALUES('a6ebdfee-5aef-11ee-8c99-0242ac120002','898c07a6-5ae7-11ee-8c99-0242ac120002','898c07a6-5ae7-11ee-8c99-0242ac120003','ACTIVE', '1998-05-25T14:02:29.204161', '2023-09-25T14:02:29.204161')
INSERT INTO group_subject (id, group_id, subject_id, status, created_at, updated_at) VALUES('a6ebdfee-5aef-11ee-8c99-0242ac120005','7e356634-5ae9-11ee-8c99-0242ac120002','898c07a6-5ae7-11ee-8c99-0242ac120006','ACTIVE', '1998-05-25T14:02:29.204161', '2023-09-25T14:02:29.204161')
INSERT INTO group_subject (id, group_id, subject_id, status, created_at, updated_at) VALUES('a6ebdfee-5aef-11ee-8c99-0242ac120006','f8705140-5ae7-11ee-8c99-0242ac120002','898c07a6-5ae7-11ee-8c99-0242ac120005','ACTIVE', '1998-05-25T14:02:29.204161', '2023-09-25T14:02:29.204161')
