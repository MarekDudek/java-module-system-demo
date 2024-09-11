module userdao {
    requires transitive user;
    requires dao;
    exports md.userdao;
    provides md.dao.Dao with md.userdao.UserDao;
}